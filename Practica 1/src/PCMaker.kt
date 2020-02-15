import com.sun.org.apache.xpath.internal.functions.FuncFalse
import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){

    var lstListaDeComputadoras = mutableListOf<PC>()

    do{
        var opcion: Int = 0
        println("""Seleccione una opción: 
        |1.- Armar una computadora
        |2.- Ver equipos armados
        |3.- Salir
        """.trimMargin())

        val response: String? = readLine()


        var computadora = PC() //cree objeto computadora

        when(response){
            "1" ->{

                do{
                    println("""Seleccione una opción: 
                        |1.- Procesador
                        |2.- Memoria RAM
                        |3.- Disco duro
                        |4.- Regresar al menu principal
                        """.trimMargin())

                    val componente: String? = readLine()
                    var bandera: Boolean

                    when(componente) {
                        "1" -> {
                            println("""PROCESADOR
                                |1.- Intel Core i3
                                |2.- Intel Core i5
                                |3.- Intel Core i7
                                """.trimMargin())
                            val strProcesador: String? = readLine()
                            var seleccion: String = ""

                            when(strProcesador){
                                "1" -> {seleccion = "Intel Core i3"}
                                "2" -> {seleccion = "Intel Core i5"}
                                "3" -> {seleccion = "Intel Core i7"}
                            }
                            println("Ha seleccionado $seleccion")
                            computadora.strProcesador = seleccion
                        }
                        "2" -> {
                            println("""MEMORIA RAM
                                |1.- Kingston ValueRAM DDR3
                                |2.- HyperX Fury DDR3
                                |3.- HyperX Savage DDR3
                                """.trimMargin())
                            val strMemoria: String? = readLine()
                            var seleccion: String = ""

                            when(strMemoria){
                                "1" -> {seleccion = "Kingston ValueRAM DDR3"}
                                "2" -> {seleccion = "HyperX Fury DDR3"}
                                "3" -> {seleccion = "HyperX Savage DDR3"}
                            }
                            println("Ha seleccionado $seleccion")
                            computadora.strMemoriaRam = seleccion
                        }
                        "3" -> {
                            println("""DISCO DURO
                                |1.- WD Red Pro 4TB NAS Hard Drive
                                |2.- WD Purple 6TB Surveillance Hard Drive
                                |3.- Seagate ST2000LX001 2 TB
                                """.trimMargin())
                            val strDisco: String? = readLine()
                            var seleccion: String = ""

                            when(strDisco){
                                "1" -> {seleccion = "WD Red Pro 4TB NAS Hard Drive"}
                                "2" -> {seleccion = "WD Red Pro 4TB NAS Hard Drive"}
                                "3" -> {seleccion = "WD Red Pro 4TB NAS Hard Drive"}
                            }
                            println("Ha seleccionado $seleccion")
                            computadora.strDiscoDuro = seleccion
                        }
                    }

                    if(computadora.strProcesador != "" && computadora.strMemoriaRam != "" && computadora.strDiscoDuro != ""){
                        break
                    }else{
                        println("Debe seleccionar todos los componentes")
                        bandera = true
                    }

                }while(/*computadora.strProcesador == "" || computadora.strMemoriaRam == "" || computadora.strDiscoDuro == ""*/bandera)
                lstListaDeComputadoras.add(computadora)
            }
            "2" -> {
                if(lstListaDeComputadoras.isEmpty()){
                    println("No hay construido ninguna computadora")
                }else{
                    var numero: Int = 0
                    for(computadora in lstListaDeComputadoras){
                        numero++
                        println("////////////////")
                        println("Caracteristicas de computadora $numero")
                        println("Procesador: " + computadora.strProcesador)
                        println("Memoria RAM: " + computadora.strMemoriaRam)
                        println("Disco duro: " + computadora.strDiscoDuro)
                        println("////////////////")
                    }
                }
            }
        }

    }while(response != "3")
    println("Gracias!")
}
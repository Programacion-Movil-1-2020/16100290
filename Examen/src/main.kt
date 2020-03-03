fun main() {
    do{
        var opcion: Int = 0
        println("""Seleccione una opción: 
        |1.- Ensamblar auto nuevo
        |2.- Ver autos ensamblados
        |3.- Salir
        """.trimMargin())

        val response: String? = readLine()

        var auto =Auto()
        var ensamblados = AutosEnsamblados()
        var lista = mutableListOf<Auto>()

        when(response) {
            "1" ->{
                println("Ingrese marca del auto: ")
                val marca: String? = readLine()
                println("Ingrese modelo: ")
                val modelo: String? = readLine()

                if (marca != null) {
                    auto.marca = marca
                }

                if (modelo != null) {
                    auto.modelo = modelo
                }
                var contador = 0

                do{
                    println("""Seleccione una caracteristica
                                |1.- Transmision
                                |2.- Aire acondicionado
                                |3.- Frenos
                                """.trimMargin())
                    val caracteristica: String? = readLine()
                    var seleccion: String = ""

                    when(caracteristica){
                        "1" -> {seleccion = "Transmision"}
                        "2" -> {seleccion = "Aire acondicionado"}
                        "3" -> {seleccion = "Frenos"}
                    }
                    print("\n")
                    println("Ha seleccionado $seleccion")
                    auto.ensamblarAuto(seleccion, 1)
                    contador++

                }while(contador != 3)

/////////////////////////////////////////////////////////
                contador = 0
                do{
                    println("""Seleccione una caracteristica especial
                                |1.- Faros de niebla
                                |2.- Faros LED
                                |3.- Asientos de piel
                                """.trimMargin())
                    val caracteristica: String? = readLine()
                    var seleccion: String = ""

                    when(caracteristica){
                        "1" -> {seleccion = "Faros de niebla"}
                        "2" -> {seleccion = "Faros LED"}
                        "3" -> {seleccion = "Asientos de piel"}
                    }
                    print("\n")
                    println("Ha seleccionado $seleccion")
                    auto.ensamblarAuto(seleccion, 0)
                    contador++
                }while(contador != 3)

                ensamblados.autosEnsamblados.add(auto)

                if(ensamblados.autosEnsamblados.isNotEmpty())
                {
                    print("No esta vacia")
                }
                lista = ensamblados.autosEnsamblados
            }
            "2"-> {
                var autosEn = AutosEnsamblados()
                if(ensamblados.autosEnsamblados.isEmpty()){
                    println("No hay construido ninguna auto")
                }else{
                    var numero: Int = 0
                    for(auto in lista){
                        println("/////")
                    }
                }

            }
        }

    }while(response != "3")
}

fun verAutos(ensamblados: MutableList<Auto>){

    var ind = 1
    for(i in ensamblados)
    {
        println("Auto numero: $ind")
        print("Marca: ${i.marca}, Modelo: ${i.modelo}")
        for(e in i.caracteristicas){
            println(e)
        }
        for(m in i.caracteristicasEspeciales){
            println(m)
        }
    }

    println("\n")
    println("Se armaron ${ensamblados.size}")
}


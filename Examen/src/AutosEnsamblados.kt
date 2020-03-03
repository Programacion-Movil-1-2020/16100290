class AutosEnsamblados() {

    var autosEnsamblados = mutableListOf<Auto>()

    fun verAutos() {
        var ind = 1
        for(i in autosEnsamblados)
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
        println("Se armaron ${autosEnsamblados.size}")
    }
}

class Auto {
    var marca: String = ""
    var modelo: String = ""

    var caracteristicas = mutableListOf<String>()
    var caracteristicasEspeciales = mutableListOf<String>()

    fun ensamblarAuto(caracteristica: String, tipo: Int) {
        if(tipo == 1){
            caracteristicas.add(caracteristica)
        } else{
            caracteristicasEspeciales.add(caracteristica)
        }
    }


}
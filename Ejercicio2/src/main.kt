fun main() {

    println("\n")
    println("Ingrese su nombre: ")
    val nombre: String? = readLine()
    println("Ingrese su edad: ")
    val edad: Int = readLine()?.toInt()!!
    println("Ingrese su sexo: ")
    val sexo: Char? = readLine()?.toCharArray()?.get(0)
    println("Ingrese su peso: ")
    val peso: Double? = readLine()?.toDouble()
    println("Ingrese su altura: ")
    val altura: Double? = readLine()?.toDouble()

    var objeto1 = Persona(nombre!!, edad, sexo!!, peso!!, altura!!)



    if(objeto1.calcularIMC() == -1) {
        println("Esta en su peso ideal.")
    } else if(objeto1.calcularIMC() == 0) {
        println("Esta por debajo de su peso ideal.")
    } else if(objeto1.calcularIMC() == 1) {
        println("Esta por encima de su peso ideal.")
    }

    if(objeto1.esMayorDeEdad()) {
        println("Es mayor de edad.")
    } else {
        println("No es mayor de edad.")
    }

    println(objeto1.toString())

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    println("\n")
    println("Ingrese su nombre: ")
    val nombre1: String? = readLine()
    println("Ingrese su edad: ")
    val edad1: Int = readLine()?.toInt()!!
    println("Ingrese su sexo: ")
    val sexo1: Char? = readLine()?.toCharArray()?.get(0)
    println("Ingrese su peso: ")

    var objeto2 = Persona(nombre1!!, edad1, sexo1!!)

    if(objeto2.calcularIMC() == -1) {
        println("Esta en su peso ideal.")
    } else if(objeto2.calcularIMC() == 0) {
        println("Esta por debajo de su peso ideal.")
    } else if(objeto2.calcularIMC() == 1) {
        println("Esta por encima de su peso ideal.")
    }

    if(objeto2.esMayorDeEdad()) {
        println("Es mayor de edad.")
    } else {
        println("No es mayor de edad.")
    }

    println(objeto2.toString())

    ///////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    println("\n")
    var objeto3 = Persona()

    if(objeto3.calcularIMC() == -1) {
        println("Esta en su peso ideal.")
    } else if(objeto3.calcularIMC() == 0) {
        println("Esta por debajo de su peso ideal.")
    } else if(objeto3.calcularIMC() == 1) {
        println("Esta por encima de su peso ideal.")
    }

    if(objeto3.esMayorDeEdad()) {
        println("Es mayor de edad.")
    } else {
        println("No es mayor de edad.")
    }

    println(objeto3.toString())





}
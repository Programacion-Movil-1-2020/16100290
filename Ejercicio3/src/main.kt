fun main() {
    println("Ingrese la cantidad de contrase;as: ")
    var cantidad: Int? = readLine()?.toInt()

    var arreglo = arrayOf(cantidad)


    var objeto = Password(8)
    println(objeto.contrasenia)
}
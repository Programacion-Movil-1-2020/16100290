fun main() {
    var miCuenta = Cuenta("Claudia Aimee")
    println(miCuenta.titular)
    miCuenta.ingresar(50.65)
    println(miCuenta.cantidad)
    miCuenta.retirar(10.00)
    println(miCuenta.cantidad)
    miCuenta.retirar(60.0)
    println(miCuenta.cantidad)
}
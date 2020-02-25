class Cuenta {

    var titular = ""
    set(value) {
        field = value
    }
    get() = field

    var cantidad = 0.0
    set(value) {
        field = value
    }
    get() = field

    override fun toString(): String {
        return "$titular, y $cantidad"
    }

    constructor(titular: String) {
        this.titular = titular
    }

    constructor(titular: String, cantidad: Double) {
        this.titular = titular
        this.cantidad = cantidad
    }

    fun ingresar(cantidad: Double): Double {
        if(cantidad > 0) this.cantidad = this.cantidad + cantidad
        return this.cantidad
    }

    fun retirar(cantidad: Double): Double {
        this.cantidad = this.cantidad - cantidad
        if(this.cantidad <= 0.0) this.cantidad = 0.0
        return this.cantidad
    }


}
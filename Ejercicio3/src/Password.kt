import com.sun.org.apache.xpath.internal.operations.Bool

class Password {
    var longitud = 8
        set(value) {
            field = value
        }
    get() = field

    var contrasenia = ""
        set(value) {
            field = value
        }
    get() = field

    constructor() {

    }

    constructor(longitud: Int) {
        this.longitud = longitud
        generarContrasena()
    }

    fun generarContrasena() {
        var vueltas = this.longitud
        var cont = 0
        var contrasena = ""

        while(cont <= vueltas) {
            var numero = (0..75).random()

            if (numero in 0..25) {
                contrasena += ('a'..'z').random().toString()
                cont++
            } else if (numero in 26..50) {
                contrasena += ('A'..'Z').random().toString()
                cont++
            } else if (numero in 51..75) {
                contrasena += (0..9).random().toString()
                cont++
            }
        }
        this.contrasenia = contrasenia
        /*var contmay = 0
        var contmin = 0
        var connum = 0
        var contrasena = ""

        while(contmay <= 3)
        {
            var mayus = ('A'..'Z').random()
            contrasena += mayus
            contmay++
        }

        while(contmin <= 4)
        {
            var min = ('a'..'z').random()
            contrasena += min
            contmin++
        }

        while(connum <= 5)
        {
            var num = (1..9).random()
            contrasena += num.toString()
            connum++
        }*/

    }

    fun esFuerte(): Boolean {
        var mayusculas = 0
        var minusculas = 0
        var numeros = 0

        for(caracter in contrasenia) {
            if(caracter.isUpperCase()) { mayusculas ++ }
            if(caracter.isLowerCase()) { minusculas ++ }
            if(caracter.isDigit()) { numeros ++ }
        }

        return (mayusculas > 2 && minusculas > 1 && numeros > 5)
    }
}
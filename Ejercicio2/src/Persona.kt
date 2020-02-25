import com.sun.org.apache.xpath.internal.operations.Bool

class Persona {
    private var nombre: String = ""
    set(value) {
        field = value
    }
    private var edad: Int = 0
        set(value) {
            field = value
        }

    private var dni: Double? = 0.0

    val sexodefault = 'M'
    private var sexo: Char = sexodefault
        set(value) {
            field = value
        }
    private var peso: Double = 0.0
        set(value) {
            field = value
        }
    private var altura: Double = 0.0
        set(value) {
            field = value
        }

    constructor() {

    }

    init {
        this.dni = generaDNI()
    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor(nombre: String, edad: Int, sexo: Char, peso: Double, altura: Double) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.dni = dni
        this.peso = peso
        this.altura = altura
    }

    fun calcularIMC(): Int {
        var resultado = 0
        var imc = 0.0
         imc = (this.peso/(this.altura * this.altura))
        if(imc < 20) {
            resultado = -1
        } else if(imc in 20..25) {
            resultado = 0
        } else if(imc > 25) {
            resultado = 1
        }
        return resultado
    }

    fun esMayorDeEdad(): Boolean {
        return (edad > 18)
    }

    fun comprobarSexo(sexo: Char) {
        if(sexo != 'M') this.sexo = 'H'
    }

    override fun toString(): String {
        return "Datos del paciente: Nombre: $nombre \n Edad: $edad \n DNI: $dni \n Sexo: $sexo \n Peso: $peso \n Altura: $altura"
    }

    fun generaDNI(): Double {
        var dni = Math.random() * 100000000
        return dni
    }









}
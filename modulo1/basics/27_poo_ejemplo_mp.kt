class Difunto(val nombre: String, val edad: Int)

class Difunto2(val nombre: String, val edad: Int) {
    fun presentarse() = "Fallecido: $nombre, edad: $edad años"
    fun esMenorDeEdad() = edad < 18
}

fun main() {
    val d = Difunto("Roberto Fuentes", 72)
    println(d.nombre)
    println(d.edad)

    val d2 = Difunto2("María López", 15)
    println(d2.presentarse())
    println(d2.esMenorDeEdad())
}

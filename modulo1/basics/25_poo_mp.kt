class Servicio(
    val id:       Int,
    val nombre:   String,
    val precio:   Double,
    private val capacidad: Int
) {
    val precioConIva: Double
        get() = precio * 1.19

    val disponible: Boolean
        get() = capacidad > 0

    override fun toString() = "$nombre (${"%.2f".format(precio)})"
}

fun main() {
    val ataud = Servicio(1, "Ataúd de madera de pino", 89.99, 15)

    println(ataud.disponible)
    println(ataud.precioConIva)
}

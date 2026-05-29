data class TipoServicio(val id: Int, val nombre: String)

data class ServicioFunerario(
    val id:          Int,
    val nombre:      String,
    val precio:      Double,
    val tipo:        TipoServicio,
    val disponible:  Boolean = true
)

fun main() {
    val p1 = ServicioFunerario(1, "Velación 24 horas", 1500.0, TipoServicio(1, "Velación"))
    val p2 = ServicioFunerario(1, "Velación 24 horas", 1500.0, TipoServicio(1, "Velación"))
    val p3 = ServicioFunerario(2, "Inhumación en cementerio", 2200.0, TipoServicio(2, "Entierro"))

    println(p1)

    println(p1 == p2)
    println(p1 == p3)

    val conDescuento = p1.copy(precio = 1200.0)
    val noDisponible = p1.copy(disponible = false)

    val (id, nombre, precio) = p1
    println("$id: $nombre — $$precio")

    listOf(p1, p3).forEach { (id2, nombre2, precio2) ->
        println("[$id2] $nombre2: $$precio2")
    }
}

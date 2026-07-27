data class Vehiculo(
    val id: Int,
    val placa: String,
    val costo: Double,
    val servicio: String,
    val enServicio: Boolean = true
)

fun main() {
    val u1 = Vehiculo(101, "PBQ-1234", 0.35, "Cremación")
    val u2 = Vehiculo(101, "PBQ-1234", 0.35, "Cremación")
    val u3 = Vehiculo(102, "PBC-5678", 0.25, "Alimentador Sur")

    println(u1)

    println(u1 == u2)
    println(u1 == u3)

    val tarifaReducida = u1.copy(costo = 0.17)
    val fueraDeLinea = u1.copy(enServicio = false)

    val (id, placa, costo) = u1
    println("$id: $placa — $$costo")

    listOf(u1, u3).forEach { (idUnidad, nPlaca, costo) ->
        println("[$idUnidad] $nPlaca: $$costo")
    }
}
data class Servicio(val id: Int, val nombre: String)

data class Vehiculo(
    val id: Int,
    val codigo: String,
    val costo: Double,
    val capacidad: Int,
    val servicio: Servicio,
    val activa: Boolean = true
) {
    val operativa: Boolean get() = activa && capacidad > 0
    val tarifaConSeguro: Double get() = costo + 0.10

    fun ajustarTarifa(porcentaje: Double): Vehiculo {
        require(porcentaje in -100.0..100.0) { "El ajuste debe estar entre -100 y 100" }
        return copy(costo = costo * (1 + porcentaje / 100))
    }
}

object GestorFunerario {
    private val servicios = mutableListOf(
        Servicio(1, "Cremación"),
        Servicio(2, "Entierro Tradicional"),
        Servicio(3, "Repatriación")
    )
    private val vehiculos = mutableListOf<Vehiculo>()
    private var siguienteId = 1

    fun registrarUnidad(codigo: String, costo: Double, capacidad: Int, rutaId: Int): Vehiculo? {
        val servicio = servicios.find { it.id == rutaId } ?: return null
        val vehiculo = Vehiculo(siguienteId++, codigo, costo, capacidad, servicio)
        vehiculos.add(vehiculo)
        return vehiculo
    }

    fun listarTodo(): List<Vehiculo> = vehiculos.toList()
    fun operativas(): List<Vehiculo> = vehiculos.filter { it.operativa }
    fun porRuta(id: Int): List<Vehiculo> = vehiculos.filter { it.servicio.id == id }
    fun buscarPorCodigo(query: String): List<Vehiculo> =
        vehiculos.filter { it.codigo.contains(query, ignoreCase = true) }
}

fun main() {
    GestorFunerario.registrarUnidad("FUN-001", 0.35, 40, 1)
    GestorFunerario.registrarUnidad("FUN-002", 0.25, 0, 2)
    GestorFunerario.registrarUnidad("FUN-003", 0.45, 60, 3)
    GestorFunerario.registrarUnidad("FUN-004", 0.35, 35, 1)
    GestorFunerario.registrarUnidad("FUN-005", 0.25, 0, 2)
    GestorFunerario.registrarUnidad("FUN-006", 0.45, 55, 3)
    GestorFunerario.registrarUnidad("FUN-007", 0.35, 42, 1)

    println("=== Todas las vehiculos registradas ===")
    for(vehiculo in GestorFunerario.listarTodo()) {
        println("${vehiculo.codigo} — Servicio: ${vehiculo.servicio.nombre} (Capacidad: ${vehiculo.capacidad})")
    }

    println("=== Resumen de flota activa ===")
}
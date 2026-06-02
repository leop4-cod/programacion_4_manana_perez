data class TipoServicioFunerario(val id: Int, val nombre: String)

data class ServicioFunerario(
    val id:       Int,
    val nombre:   String,
    val precio:   Double,
    val lugares:  Int,
    val tipo:     TipoServicioFunerario,
    val activo:   Boolean = true
) {
    val disponible: Boolean get() = activo && lugares > 0
    val precioConIva: Double get() = precio * 1.12

    fun aplicarDescuento(porcentaje: Double): ServicioFunerario {
        require(porcentaje in 0.0..100.0) { "Descuento debe ser entre 0 y 100" }
        return copy(precio = precio * (1 - porcentaje / 100))
    }
}

object CatalogoFuneraria {
    private val tipos = mutableListOf(
        TipoServicioFunerario(1, "Velación"),
        TipoServicioFunerario(2, "Entierro"),
        TipoServicioFunerario(3, "Cremación")
    )
    private val servicios   = mutableListOf<ServicioFunerario>()
    private var siguienteId = 1

    fun agregarServicio(nombre: String, precio: Double, lugares: Int, tipoId: Int): ServicioFunerario? {
        val tipo     = tipos.find { it.id == tipoId } ?: return null
        val servicio = ServicioFunerario(siguienteId++, nombre, precio, lugares, tipo)
        servicios.add(servicio)
        return servicio
    }

    fun listar(): List<ServicioFunerario>              = servicios.toList()
    fun disponibles(): List<ServicioFunerario>         = servicios.filter { it.disponible }
    fun porTipo(id: Int): List<ServicioFunerario>      = servicios.filter { it.tipo.id == id }
    fun buscar(query: String): List<ServicioFunerario> =
        servicios.filter { it.nombre.contains(query, ignoreCase = true) }
}

fun main() {
    CatalogoFuneraria.agregarServicio("Velación sala VIP",     2500.0, 5, 1)
    CatalogoFuneraria.agregarServicio("Velación básica",        800.0, 0, 1)
    CatalogoFuneraria.agregarServicio("Inhumación cementerio", 1800.0, 3, 2)
    CatalogoFuneraria.agregarServicio("Cremación estándar",    1200.0, 2, 3)

    println("=== Todos los servicios ===")
    CatalogoFuneraria.listar().forEach { s ->
        val estado = if (s.disponible) "✅" else "❌"
        println("$estado ${s.nombre} — ${"%.2f".format(s.precioConIva)} (con IVA)")
    }

    println("\n=== Disponibles con 10% descuento ===")
    CatalogoFuneraria.disponibles()
        .map { it.aplicarDescuento(10.0) }
        .forEach { println("  ${it.nombre}: ${"%.2f".format(it.precio)}") }
}

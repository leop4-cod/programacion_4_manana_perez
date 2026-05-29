class CostoServicioFunerario(costo: Double) {

    var costo: Double = costo
        set(value) {
            require(value >= 0) { "El costo no puede ser negativo" }
            field = value
        }

    val costoConIva: Double
        get() = costo * 1.12

    val costoConDescuento: Double
        get() = costo * 0.90

    val descripcion: String
        get() = when {
            costo < 500   -> "Servicio básico"
            costo < 1500  -> "Servicio estándar"
            costo < 3000  -> "Servicio premium"
            costo < 5000  -> "Servicio de lujo"
            else          -> "Servicio exclusivo"
        }
}

fun main() {
    val servicio = CostoServicioFunerario(1200.0)
    println("${servicio.costo} GTQ = ${servicio.costoConIva} con IVA = ${servicio.costoConDescuento} con descuento")
    println(servicio.descripcion)

    servicio.costo = 300.0
    println("${servicio.costo} GTQ → ${servicio.descripcion}")
}

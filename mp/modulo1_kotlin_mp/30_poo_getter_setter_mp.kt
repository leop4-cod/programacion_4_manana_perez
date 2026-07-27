class CapacidadUnidad(asistentes: Int) {

    var asistentes: Int = asistentes
        set(value) {
            require(value >= 0) { "La cantidad de asistentes no puede ser negativa" }
            require(value <= 80) { "Supera la capacidad técnica de la vehiculo (máximo 80)" }
            field = value
        }

    val porcentajeOcupacion: Double
        get() = (asistentes * 100.0) / 80.0

    val espacioDisponible: Int
        get() = 80 - asistentes

    val estadoCarga: String
        get() = when {
            asistentes == 0  -> "Vehiculo Vacía"
            asistentes < 20  -> "Baja Ocupación"
            asistentes < 50  -> "Ocupación Media"
            asistentes < 75  -> "Vehiculo Casi Llena"
            else            -> "Capacidad Máxima"
        }
}

fun main() {
    val bus = CapacidadUnidad(20)
    println("${bus.asistentes} asistentes = ${bus.porcentajeOcupacion}% de ocupación")
    println("Estado: ${bus.estadoCarga}")

    bus.asistentes = 78
    println("${bus.asistentes} asistentes → ${bus.estadoCarga}")
    println("Asientos libres: ${bus.espacioDisponible}")

    
}
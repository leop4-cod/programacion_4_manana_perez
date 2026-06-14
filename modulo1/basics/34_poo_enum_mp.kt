enum class EstadoServicio(val descripcion: String, val esTerminal: Boolean) {
    PENDIENTE    ("Esperando confirmación",    false),
    EN_PROCESO   ("Servicio en curso",         false),
    COMPLETADO   ("Servicio finalizado",       true),
    CANCELADO    ("Cancelado por la familia",  true),
    RECHAZADO    ("No aprobado",               true);

    fun puedeTransicionarA(siguiente: EstadoServicio): Boolean = when (this) {
        PENDIENTE    -> siguiente == EN_PROCESO || siguiente == CANCELADO
        EN_PROCESO   -> siguiente == COMPLETADO || siguiente == RECHAZADO
        else         -> false
    }
}

fun main() {
    val estado = EstadoServicio.EN_PROCESO
    println(estado.descripcion)
    println(estado.esTerminal)

    val icono = when (estado) {
        EstadoServicio.PENDIENTE    -> "⏰"
        EstadoServicio.EN_PROCESO   -> "⏳"
        EstadoServicio.COMPLETADO   -> "✅"
        EstadoServicio.CANCELADO    -> "🚫"
        EstadoServicio.RECHAZADO    -> "❌"
    }
    println(icono)

    println(estado.puedeTransicionarA(EstadoServicio.COMPLETADO))
}

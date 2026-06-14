sealed class NotificacionFuneraria(val titulo: String, val mensaje: String) {
    abstract fun formatear(): String

    data class Email(
        val destinatario: String,
        val asunto:       String,
        val cuerpo:       String
    ) : NotificacionFuneraria(asunto, cuerpo) {
        override fun formatear() =
            "📧 Email → $destinatario\n   Asunto: $titulo\n   ${mensaje.take(50)}..."
    }

    data class Push(val dispositivo: String, val icono: String = "⚰️")
        : NotificacionFuneraria("Push", "") {
        override fun formatear() = "$icono Push → $dispositivo: $titulo"
    }

    data class Sms(val telefono: String, val texto: String)
        : NotificacionFuneraria("SMS", texto) {
        override fun formatear() = "📱 SMS → $telefono: ${texto.take(160)}"
    }

    object Silenciosa : NotificacionFuneraria("", "") {
        override fun formatear() = "🔕 Notificación silenciosa"
    }
}

interface EnviadorNotificacion {
    val nombre: String
    fun enviar(notificacion: NotificacionFuneraria): Boolean
}

class ServicioEmail : EnviadorNotificacion {
    override val nombre = "Email"
    override fun enviar(n: NotificacionFuneraria): Boolean {
        if (n !is NotificacionFuneraria.Email) return false
        println("  [EMAIL] → ${n.destinatario}")
        return true
    }
}

class ServicioPush : EnviadorNotificacion {
    override val nombre = "Push"
    override fun enviar(n: NotificacionFuneraria): Boolean {
        if (n !is NotificacionFuneraria.Push) return false
        println("  [PUSH] → ${n.dispositivo}")
        return true
    }
}

class DispatcherFuneraria(private val servicios: List<EnviadorNotificacion>) {

    fun enviar(notificacion: NotificacionFuneraria) {
        println(notificacion.formatear())
        val exito = servicios.any { it.enviar(notificacion) }
        if (!exito) println("  ⚠️ Sin servicio disponible")
        println()
    }
}

fun main() {
    val dispatcher = DispatcherFuneraria(listOf(ServicioEmail(), ServicioPush()))

    listOf(
        NotificacionFuneraria.Email("familia@correo.com", "Condolencias", "Le informamos que el servicio está listo."),
        NotificacionFuneraria.Push("iPhone-Familia"),
        NotificacionFuneraria.Sms("+50255551234", "Su orden funeraria CF-001 ha sido confirmada"),
        NotificacionFuneraria.Silenciosa
    ).forEach { dispatcher.enviar(it) }
}

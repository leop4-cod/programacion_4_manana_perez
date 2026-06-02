object ConfiguracionFuneraria {
    val nombre:    String = "Funeraria La Paz"
    val telefono:  String = "+502 2222-3333"
    private val claveInterna: String = "fun-key-secreto-456"

    fun direccion() = "6a Avenida 12-34, Ciudad de Guatemala"
    fun credenciales() = mapOf("Authorization" to "Bearer $claveInterna")
}

class Empleado private constructor(val id: Int, val nombre: String) {
    companion object {
        private var contadorId = 0

        fun crear(nombre: String, email: String): Empleado? {
            if (nombre.isBlank() || !email.contains("@")) return null
            return Empleado(++contadorId, nombre.trim())
        }

        const val ROL_DEFECTO = "asistente"
    }
}

fun main() {
    println(ConfiguracionFuneraria.direccion())

    val e = Empleado.crear("Pedro Ramírez", "pedro@funeraria.com")
    println(e)
}

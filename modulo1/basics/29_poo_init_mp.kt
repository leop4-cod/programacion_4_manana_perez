class ClienteFuneraria(val nombre: String, val telefono: String) {
    val nombreNormalizado: String
    val operadoraTelefono: String

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        require(telefono.startsWith("+")) { "Teléfono inválido: $telefono" }

        nombreNormalizado = nombre.trim().lowercase()
        operadoraTelefono = telefono.substringAfter("+").take(3)
    }
}

fun main() {
    val c = ClienteFuneraria("  Juan Pérez  ", "+502 5555-1234")
    println(c.nombreNormalizado)
    println(c.operadoraTelefono)
}

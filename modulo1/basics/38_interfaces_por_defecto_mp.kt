interface Registrable {
    val id: String
    fun registrar(): String
    val version: Int get() = 1
}

interface Verificable {
    val errores: List<String>
    val esValido: Boolean get() = errores.isEmpty()

    fun verificar(): Boolean
    fun imprimirErrores() {
        if (errores.isEmpty()) println("Sin errores")
        else errores.forEach { println("  ❌ $it") }
    }
}

data class OrdenServicio(
    override val id: String,
    val cliente:     String,
    val servicios:   List<String>,
    val total:       Double
) : Registrable, Verificable {

    override fun registrar() =
        "$id|$cliente|${servicios.joinToString(",")}|$total"

    override val errores: List<String> get() = buildList {
        if (cliente.isBlank()) add("El cliente no puede estar vacío")
        if (servicios.isEmpty())   add("La orden debe tener al menos un servicio")
        if (total <= 0)        add("El total debe ser mayor que cero")
    }

    override fun verificar() = esValido
}

fun main() {
    val orden1 = OrdenServicio("ORD-001", "Familia García", listOf("Velación", "Ataúd"), 3500.0)
    val orden2 = OrdenServicio("ORD-002", "",    emptyList(),                -5.0)

    fun procesarRegistrable(r: Registrable) = println("→ ${r.registrar()}")
    fun procesarVerificable(v: Verificable) {
        println("Válido: ${v.esValido}")
        v.imprimirErrores()
    }

    procesarRegistrable(orden1)
    procesarVerificable(orden1)
    procesarVerificable(orden2)
}

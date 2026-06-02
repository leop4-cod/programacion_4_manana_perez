fun main() {
    println("Controles de flujo")
    println("Condicional if - else")
    println("¿Tiene plan funerario? s/n:")
    val tienePlan = readLine()?.trim()?.lowercase() == "s"

    println("Costo base del servicio:")
    val costoBase = readLine()?.toDoubleOrNull() ?: 0.0

    if (tienePlan) {
        val cobertura = costoBase * 0.80
        println("El plan cubre: $${"%.2f".format(cobertura)}")
    } else {
        println("Pago particular: $${"%.2f".format(costoBase)}")
    }
}
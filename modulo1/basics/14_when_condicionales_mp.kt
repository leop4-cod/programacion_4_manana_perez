fun main() {
    println("Controles de flujo when - con condiciones arbitrarias")
    println("Escriba un codigo")
    println("Edad del difunto:")
    val edad = readLine()?.toIntOrNull()?:0
    println("La familia tiene contrato previo:")
    val tieneContrato = readLine()?.trim()?.lowercase() == "s"
    val plan = if (tieneContrato) {
        println("Plan contratado (Basico, Intermedio, Premium):")
        readLine()?.trim()?.uppercase()?.lowercase() ?: ""
    } else {
        ""
    }
    val descuento = when {
        !tieneContrato && edad < 18 -> 0.0
        !tieneContrato && edad >= 65 -> 15.0
        !tieneContrato -> 45.0
        plan == "basico" -> 20.0
        plan == "intermedio" -> 10.0
        plan == "premium" -> 0.0
        else -> 0.0
    }
    println("Descuento aplicado: $${"%.2f".format(descuento)}")
}

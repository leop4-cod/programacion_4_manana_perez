fun main() {
    println("controles de flujo")
    println("condicional if - else")
    println("tiene seguro medico s/n:")
    val tieneseguro = readLine()?.trim()?.lowercase() == "s"

    println("costo base:")
    val costobase = readLine()?.toDoubleOrNull() ?: 0.0

    if (tieneseguro) {
        val cobertura = costobase * 0.80
        println("seguro cubre: $${"%.2f".format(cobertura)}")
    } else {
        println("pago particular: $${"%.2f".format(costobase)}")
    }
}   
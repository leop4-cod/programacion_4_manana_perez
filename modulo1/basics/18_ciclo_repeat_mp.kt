fun main() {
    println("Controles de Flujo Iteraciones, Ciclos repetitivos -Ciclo Repeat")
    println("Cuantos servicios funerarios registrar")
    
    val mediciones = readLine()?.toIntOrNull() ?: 3
    var totalCosto = 0
    
    repeat(mediciones) { i ->
        println("Servicio ${i + 1} (costo en quetzales)")
        val costo = readLine()?.toIntOrNull() ?: 0
        totalCosto += costo
    }
    val promedio = totalCosto / mediciones
    println("Costo promedio por servicio: $promedio GTQ")
    println("Clasificacion: ${
        when {
            promedio < 500 -> "Servicio Economico"
            promedio <= 2000 -> "Servicio Estandar"
            else -> "Servicio Premium"
        }
    }")
}

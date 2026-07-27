fun main() {
  println("Gestión de Transporte")
  val reporte = obtenerEstadoRuta()
  println("$reporte")
 
  val totalBuses: Int = contarUnidades(15, 10)
  println(totalBuses)
  println("${calcularAsientosLibres(40, 25)}")
  println(calcularAsientosLibres(40, 25))
  println(estimarTiempoLlegada(20, 5))
  registrarSalida("Vehiculo 05")
}

fun obtenerEstadoRuta(): String {
    return "Servicio Despejada"
}

fun contarUnidades(lineaA: Int, lineaB: Int): Int {
    return lineaA + lineaB
}

fun calcularAsientosLibres(capacidad: Int, ocupados: Int) = capacidad - ocupados

fun estimarTiempoLlegada(distancia: Int, velocidad: Int) = distancia / velocidad

fun registrarSalida(vehiculo: String) {
    println("Salida confirmada: $vehiculo")
}
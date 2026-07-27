fun main() {
  println("Utilidades de Flota")
  val vehiculos = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(vehiculos)
  val unidadesDobladas = vehiculos.map { it * 2 }
  println(unidadesDobladas)
  val registrosBus = vehiculos.map { "Bus-$it" }
  println(registrosBus)
  
  println("filter")
  val rutasPares = vehiculos.filter { it % 2 == 0 }
  println(rutasPares)
  val flotaPesada = vehiculos.filter { it > 5 }
  println(flotaPesada)
  val busesEspeciales = vehiculos.filter { it % 2 == 0 && it > 5 }
  println(busesEspeciales)
  val rutasImpares = vehiculos.filterNot { it % 2 == 0 }
  println(rutasImpares)
  
  val bitacora = listOf(101, "En Servicio", 102, "Mantenimiento", true, 500)
  val estadosTexto = bitacora.filterIsInstance<String>()
  println(estadosTexto)
  
  println("reduce")
  val conteoPasajeros = listOf(1, 2, 3, 4, 5)
  val sumaPasajeros = conteoPasajeros.reduce { acc, n -> acc + n }
  println(sumaPasajeros)
  val factorCarga = conteoPasajeros.reduce { acc, n -> acc * n }
  println(factorCarga)
  
  println("fold")
  val basePasajerosSuma = conteoPasajeros.fold(100) { acc, n -> acc + n }
  println(basePasajerosSuma)
  val basePasajerosProd = conteoPasajeros.fold(100) { acc, n -> acc * n }
  println(basePasajerosProd)
  
  println("Ordenar")
  println("Ascendente: ${vehiculos.sorted()}")
  println("Descendente: ${vehiculos.sortedDescending()}")
  println("Prioridad inversa: ${vehiculos.sortedBy { -it }}")
  
  println("Agregacion")
  println("HorasServicio total: ${vehiculos.sum()}")
  println("Promedio vehiculos: ${vehiculos.average()}")
  println("Vehiculo menor ID: ${vehiculos.min()}")
  println("Vehiculo mayor ID: ${vehiculos.max()}")
  println("Contar servicios largas: ${vehiculos.count { it > 4 }}")
  
  println("Busqueda")
  println("Encontrar vehiculo: ${vehiculos.find { it > 4 }}")
  println("Encontrar última vehiculo: ${vehiculos.findLast { it > 4 }}")
  println("Hay vehiculos activas?: ${vehiculos.any { it > 4 }}")
  println("Todas son válidas?: ${vehiculos.all { it > 0 }}")
  println("Ninguna fuera de rango?: ${vehiculos.none { it > 10 }}")
}
fun main() {
  println("Listas de Servicios - Inmutable")
  val servicios = listOf("Norte", "Sur", "Este", "Sur", "Oeste")
  println("Cantidad de servicios: ${servicios.size}")
  println("Mostrar servicio índice 0: ${servicios[0]}")
  println("Mostrar la primera servicio: ${servicios.first()}")
  println("Mostrar la última servicio: ${servicios.last()}")
  
  println("Mostrar servicio índice 2: ${servicios.get(2)}")
  println("Posición de la primera servicio 'Sur': ${servicios.indexOf("Sur")}")
  println("¿Existe la servicio 'Este'?: ${servicios.contains("Este")}")
  println("¿Está la servicio 'Sur' activa?: ${"Sur" in servicios}")
  
  println("Subsector de servicios: ${servicios.subList(1, 3)}")
  println("Tomar primeras 2 servicios: ${servicios.take(2)}")
  println("Suprimir primeras tres servicios: ${servicios.drop(3)}")
  println("Tomar las últimas dos servicios: ${servicios.takeLast(2)}")
  
  for(servicio in servicios){
      println("Servicio: $servicio")
  }

  println("Vehiculos en Terminal - Mutables")
  val vehiculos = mutableListOf("Bus-01", "Bus-02", "Bus-03", "Bus-04")
  println(vehiculos)
  vehiculos.add("Bus-05")
  vehiculos.add(0, "Bus-00")
  println(vehiculos)
  vehiculos.remove("Bus-05")
  println(vehiculos)
  vehiculos[1] = "Bus-Editado"
  println(vehiculos)

  println("Cola de Despacho (Array deque)")
  val despacho = ArrayDeque<Int>()
  println(despacho)
  despacho.addFirst(101)
  println(despacho)
  despacho.addLast(102)
  println(despacho)
  despacho.addLast(100)
  println(despacho)
  despacho.removeFirst()
  println(despacho)
  despacho.removeLast()
  println(despacho)
}
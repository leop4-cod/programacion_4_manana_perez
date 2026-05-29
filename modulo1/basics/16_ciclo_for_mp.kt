fun main() {
  println("Controles de Flujo Iteraciones, Ciclos repetitivos ciclo for")
  println("For con rango")
  
  for( i in 1..10){
     val a=5
      println("5x$i=${i*a}")
  }
  
  println("For con until")
  for( i in 1 until 11){
     val a=5
      println("5x$i=${i*a}")
  }
  
  println("For con pasos")
  for(i in 1..10 step 3){
      println(i)
  }
  
  println("For descendente")
  for(i in 10 downTo 1){
      println(i)
  }
  
  println("For con listas")
  val servicios = listOf("Velacion", "Cremacion", "Inhumacion")
  for(servicio in servicios){
      println(servicio)
  }
  
  println("For con listas index valor")
  for ((index, valor) in servicios.withIndex()){
      println("$index->$valor")
  }
  
  println("For con Brake")
  for(i in 1..10){
      if(i==5){
          break;
      }
  }
  
  println("For con Continue")
  for(i in 1..10){
      if(i==3){
          continue;
      }
      println("item $i")
  }
  
   println("For con Continue")
  for(i in 1..10){
      if(i==3) continue;
      if(i==7) break;
      println("item $i")
  }
  
  val difuntos = listOf(
    Triple("Garcia, M", 3, "Velacion"),
    Triple("Zambrano, L", 1, "Cremacion"),
    Triple("Torres, R", 2, "Inhumacion"),
  )
  for((posicion,difunto) in difuntos.withIndex()){
      val (nombre, diasServicio, tipoServicio) = difunto
      val alertaDias = if(diasServicio>=2) "Urgente" else "Normal"
      val alertaTipo = if (tipoServicio=="Cremacion") "Requiere horno" else "Sala disponible"
      println("Sala $posicion - $nombre - Dias: $diasServicio $alertaDias - Servicio: $tipoServicio $alertaTipo")
  }
}

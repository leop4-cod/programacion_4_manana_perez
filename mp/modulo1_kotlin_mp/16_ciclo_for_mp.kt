fun main() {
  println("Controles de flujo iteraciones - ciclos repetitivos ciclos for")
  println("For con rango")
  for( unidadId in 1..20 ){
      println("Vehiculo $unidadId en servicio")
    }
      
  println("For con rango")
  for( unidadId in 1 until 15 ){
      println("Vehiculo $unidadId operativa")
  }
  
  println("For con pasos")
  for(unidadId in 1..50 step 5){
      println("Vehiculo $unidadId en revision")
  }
  
  println("For descendente")
  for(unidadId in 30 downTo 1){
      println("Vehiculo $unidadId regresando")
  }
  
  println("For con listas")
  val servicios = listOf("Linea Norte", "Linea Sur", "Linea Este", "Linea Oeste", "Linea Centro")
  for(servicio in servicios){
      println("Servicio activa: $servicio")
  }
  
  println("For con listas index valor")
  
  for((index, servicio) in servicios.withIndex()){
      println("$index -> Servicio: $servicio")
  }
  
  println("For con break")
  for(unidadId in 1..25){
      if(unidadId==12){
      break;
      }
      println("Procesando vehiculo $unidadId")
  }
  
  println("For con continue")
  for(unidadId in 1..30){
      if(unidadId==15){
          continue;
      }
      println("Difunto abordando en vehiculo $unidadId")
  }
  
   println("For con continue")
    for (i in 1..10) {
        if (i == 3) continue
        if (i == 7) break
        println("item $i")
    }

    val despachos = listOf(
        Triple("Interno 45", 85.5, 40),
        Triple("Interno 12", 12.2, 55),
        Triple("Interno 09", 5.0, 10)
    )

    for ((posicion, reporte) in despachos.withIndex()) {
        val (codigo, combustible, asistentes) = reporte
        val alertaCombustible = if (combustible <= 10.0) "Reserva" else "Normal"
        val alertaPasajeros = if (asistentes > 50) "Exceso" else "Normal"
        println("Andén $posicion - $codigo - Comb: $combustible % $alertaCombustible - Ocupación: $asistentes $alertaPasajeros ")
    }
  
}
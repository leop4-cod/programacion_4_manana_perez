fun main() {
  println("Controles de flujo iteraciones - ciclos repetitivos - ciclo while")
  
  println("While basico")
  var unidadContador = 1
  while(unidadContador <= 5){
      println("Revisando vehiculo operativa: $unidadContador")
      unidadContador ++
  }
  
  println("Do While")
  unidadContador = 1
  do {
      println("Validando torniquete de acceso: $unidadContador")
      unidadContador ++
  } while(unidadContador <= 5)
  
  println("Break continue")
  var paradaId = 1
  while(paradaId <= 10){
      paradaId ++
      if(paradaId == 3) continue 
      if(paradaId == 7) break    
      println("Bus llegando a parada: $paradaId")
  }
 
  var comando: String
  while(true){
      println("Escribe 'parar' para terminar el despacho")
      comando = readLine()?.lowercase()?:""
      if(comando=="parar") break
      println("Comando de tráfico ingresado: $comando")
  }
 
  var cod: Int
  while(true){
      println("Menu de opciones de transporte")
      val cod = readLine()?.toIntOrNull()?:0 
      val menu = when(cod){
          1 -> "Reportar retraso"
          2 -> "Cargar saldo"
          3 -> "Ver horarios"
          4 -> "Salir"
          else -> "Opcion invalida"
      }
      println("Codigo seleccionado: $cod")
      if(cod == 1){
          println("Reporte de retraso enviado a central")
      }
      if(cod == 2){
         println("Saldo actualizado en tarjeta")
      }
      if(cod == 3){
          println("Mostrando tabla de servicios vigentes")
      }
      if(menu=="Salir") break
      println("Estado de operacion: $menu")
    }
 
  println("Cuantas vehiculos auditar para calcular flujo de asistentes")
  val auditorias = readLine()?.toIntOrNull()?:0
  var totalPasajeros = 0
  
  repeat(auditorias){ i ->
      println("Auditoria vehiculo ${i+1} (conteo en 15 min.)")
      val asistentes = readLine()?.toIntOrNull()?:0
      totalPasajeros += asistentes * 4 
  }
  
  val promedioFlujo = if (auditorias > 0) totalPasajeros / auditorias else 0
  println("Flujo de asistentes promedio : $promedioFlujo personas/hora")
  println("Clasificacion de demanda: ${
      when{
          promedioFlujo < 60 -> "Demanda Baja"
          promedioFlujo <= 100 -> "Demanda Moderada"
          else -> "Saturacion de Servicio"
      }
  }")
}
fun main() {
  println("Controles de Flujo when con condiciones arbitrarias")
  println("Nombre de la familia")
  val nombreFamilia=readLine()?.trim()?.lowercase()?:"Sin Identificacion"
  println("Estado del servicio (URGENTE/PROGRAMADO/EN_PROCESO/COMPLETADO)")
  val estado=readLine()?.trim()?.uppercase()?:""
  

  when (estado){
      "URGENTE"->{
          println("URGENTE: Familia: $nombreFamilia")
          println("Contactar al director de la funeraria")
          println("Activar protocolo de servicio urgente")
      }
      "PROGRAMADO"->{
          println("PROGRAMADO: Familia: $nombreFamilia")
          println("Confirmar fecha y hora del servicio")
          println("Revisar disponibilidad de sala en 15 minutos")
      }
      "EN_PROCESO"->println("En proceso: Familia: $nombreFamilia")
      "COMPLETADO"->println("Completado: Familia: $nombreFamilia servicio finalizado con exito")
      else -> println("Estado no reconocido")
  }
  }

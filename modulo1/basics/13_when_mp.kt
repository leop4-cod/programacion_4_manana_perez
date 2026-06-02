fun main() {
  println("Controles de Flujo")
  println("Escriba codigo: ")
  val codigo=readLine()?.toIntOrNull()?:0
  val servicio = when(codigo){
      1->"Velacion"
      2->"Cremacion"
      3->"Inhumacion"
      4->"Embalsamamiento"
      5->"Traslado de restos"
      6->"Preparacion del cuerpo"
      else -> "Servicio no registrado"
  }
  println("Servicio: $servicio")
}

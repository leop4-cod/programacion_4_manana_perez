fun main() {
  println("controles de flujo")
  println("condicional if")
  println("Incluir edad del difunto:")
  val edadPasajero = readLine()?.toIntOrNull() ?: 25
  if (edadPasajero >= 65){
      println("Descuento para jubilados: costo reducida")
  }
  if(edadPasajero >= 18){
      println("Acceso permitido: boleto completo")
  }
  println("Edad registrada: $edadPasajero años")
}
fun main() {
  println("Controles de flujo")
  println("Condicional if")
  println("Ingrese el monto del servicio funerario:")
  val monto = readLine()?.toDoubleOrNull() ?: 500.0

  if (monto >= 3000.0) {
      println("Servicio premium seleccionado: incluye sala VIP y carroza especial")
  }
  if (monto >= 5000.0) {
      println("Servicio exclusivo: incluye ceremonia personalizada y transmisión en vivo")
  }

  println("Monto registrado: $$monto")
}
fun main() {
  println("Operadores Lógicos - Funeraria")
  val pagoRealizado = true
  val tieneDocumentos = false
  val salaDisponible = true
 
  println("&& - And Lógico")
  println("$pagoRealizado && $tieneDocumentos = ${pagoRealizado && tieneDocumentos}")
  println("$salaDisponible && $pagoRealizado = ${salaDisponible && pagoRealizado}")
  
  println("|| - Or Lógico")
  println("$pagoRealizado || $tieneDocumentos = ${pagoRealizado || tieneDocumentos}")
  println("$salaDisponible || $pagoRealizado = ${salaDisponible || pagoRealizado}")
  
  println("! - Not Lógico")
  println("! $pagoRealizado = ${!pagoRealizado}")
  println("! $salaDisponible = ${!salaDisponible}")
}
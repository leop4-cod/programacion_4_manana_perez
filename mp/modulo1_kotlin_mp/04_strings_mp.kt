fun main() {
    val servicio = "Linea 1"
    val destino = "Centro" 
    val capacidad = 50 
    //variable simple
    println("Servicio $servicio") 
    //expresion
    println("Destino completo : ${servicio.uppercase()} ${destino.uppercase()}")
    val destinoCompleto = "Destino Completo : ${servicio.uppercase()} ${destino.uppercase()}"
    println(destinoCompleto)
    println("Capacidad : ${capacidad+10} asistentes")
    //string Multilinea
    val boleto = """
    |Servicio: $servicio $destino
    |Capacidad: $capacidad
    |Acceso: ${if(capacidad>=30) "permitido" else "Denegado"}
    """.trimMargin()
    println(boleto)
}
    
   

fun main() {
    val nombre = "carlitos"
    val apellido = "alquinga"
    val edad = 65
    // Variable Simple
    println("Bienvenido familiar de $nombre")
    //Expresión
    println("Servicio para : ${nombre.uppercase()} ${apellido.uppercase()}")
    val nombreCompleto = "Servicio para : ${nombre.uppercase()} ${apellido.uppercase()}"
    println(nombreCompleto)
    println("Edad del fallecido : ${edad + 0} años")
   
    //String Multilinea
    val tarjeta = """
        |Nombre: $nombre $apellido
        |Edad: $edad
        |Tipo de sala: ${if (edad >= 60) "Sala Preferencial" else "Sala Estándar"}
        """.trimMargin()
    println(tarjeta)
}
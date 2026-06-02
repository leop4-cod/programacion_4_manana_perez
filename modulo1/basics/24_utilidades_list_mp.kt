fun main() {
    println("Responde si o no:")
    val respuesta = readLine()?.trim()?.lowercase()

    if (respuesta == "si" || respuesta == "sí") {
        println("El usuario respondió que sí")
    } else if (respuesta == "no") {
        println("El usuario respondió que no")
    } else {
        println("Respuesta no válida. Escribe solo si o no.")
    }
}

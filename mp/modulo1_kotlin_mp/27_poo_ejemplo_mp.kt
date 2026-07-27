class Director(val nombre: String, val unidadAsignada: Int)

class Servicio(val nombre: String, val tiempoEstimado: Int) {
    fun obtenerDetalles() = "Servicio: $nombre - Tiempo: $tiempoEstimado minutos"
    fun esRutaLarga() = tiempoEstimado > 60
}

fun main() {
    val c = Director("Danna", 102)
    println(c.nombre)           
    println(c.unidadAsignada)   

    val r = Servicio("Cremación", 45)
    println(r.obtenerDetalles()) 
    println(r.esRutaLarga())     
}
fun main() {
    //no mutable
    val nombre = "carlitos"
    val edad: Int = 45
    val costoServicio = 3500
    
    //mutable
    var ataudesDisponibles = 5
    ataudesDisponibles = ataudesDisponibles + 1
    println(ataudesDisponibles)
    ataudesDisponibles = ataudesDisponibles - 1
    println(ataudesDisponibles)
    
    println("$nombre tenia $edad años. Costo del servicio: $$costoServicio")
}
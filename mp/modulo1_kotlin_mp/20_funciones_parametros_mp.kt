fun main() {
    println("Transporte Público - Parámetros por defecto")
    println(registrarUnidad("Vehiculo 01", 2024, "Troncal", true))
    println(registrarUnidad("Vehiculo 05"))
    println(registrarUnidad("Vehiculo 12", 2018))
    println(registrarUnidad("Vehiculo 08", 2020, "Alimentador"))
    
    println(registrarUnidad(modelo=2022, identificador="Vehiculo 25", activo=false))
}

fun registrarUnidad(
    identificador: String,
    modelo: Int = 2015,
    tipoRuta: String = "Urbana",
    activo: Boolean = true
): String {
    return "Bus[$identificador, modelo=$modelo, servicio=$tipoRuta, estado=$activo]"
}
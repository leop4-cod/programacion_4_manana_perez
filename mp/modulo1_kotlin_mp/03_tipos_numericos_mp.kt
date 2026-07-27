fun main() {
    println("Tipos Datos")
    println("Numeros Enteros")
    val numeroBuses: Byte = 127 
    println("Numero de Buses $numeroBuses")
    val pasajerosDiarios: Short = 32_765
    println("Asistentes Diarios $pasajerosDiarios")
    val totalPasajeros: Int = 2_147_483_647 
    println("Total Asistentes $totalPasajeros")
    val distanciaRecorrida: Long = 32_322_322_322_322_322L 
    println("Distancia Recorrida $distanciaRecorrida")
    val costo: Float = 1.147f 
    println("Costo $costo")
    val velocidadPromedio: Double = 3.14159265 
    println("Velocidad Promedio $velocidadPromedio")
    
    
    val director="Juan"
    val experiencia = 56 
    println("Director $director")
    val conductorTipo = director::class.simpleName
    println("Tipo inferido director: $conductorTipo")
    println("Tipo inferido director: ${director::class.simpleName}")
    val experienciaTipo = experiencia::class.simpleName
    println("Experiencia: $experiencia") 
    println("Tipo inferido experiencia: $experienciaTipo")
    println("Tipo inferido experiencia : ${experiencia::class.simpleName}")
}
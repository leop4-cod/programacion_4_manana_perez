fun main() {
    println("Map inmutable")

    val salas = mapOf(
        "Sala A" to "Velacion",
        "Sala B" to "Cremacion",
        "Sala C" to "Inhumacion",
        "Capilla" to "Misa de cuerpo presente"
    )

    println(salas["Sala A"])
    println(salas["Sala D"])
    println(salas.getOrDefault("Sala A", "Desconocido"))
    println(salas.getOrDefault("Sala D", "Desconocido"))

    println(salas)
    println(salas.keys)
    println(salas.values)
    println(salas.entries)

    for ((sala, servicio) in salas) {
        println("$sala - $servicio")
    }

    println("Map Mutable")

    val inventario = mutableMapOf(
        "Atauds" to 10,
        "Urnas" to 4,
        "Coronas de flores" to 12,
        "Velas" to 8
    )

    inventario["Carrozas"] = 5
    println(inventario)

    inventario["Atauds"] = 20
    println(inventario)

    inventario.remove("Velas")
    println(inventario)

    inventario.getOrPut("Mortajas") { 15 }
    println(inventario)

    inventario.getOrPut("Urnas") { 15 }
    println(inventario)
}

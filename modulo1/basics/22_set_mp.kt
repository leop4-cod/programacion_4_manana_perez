fun main() {
    println("Set")

    val numeros = setOf(1, 2, 3, 4, 8, 4, 1, 3)
    println("numeros set: ${numeros}")

    println("Operaciones de conjuntos")

    val serviciosBasicos = setOf(2, 4, 6, 8, 10)
    val serviciosPremium = setOf(3, 6, 9, 12)

    println("serviciosBasicos set: ${serviciosBasicos}")
    println("serviciosPremium set: ${serviciosPremium}")

    println("union : ${serviciosBasicos union serviciosPremium}")
    println("interseccion : ${serviciosBasicos intersect serviciosPremium}")
    println("subsraccion : ${serviciosBasicos subtract serviciosPremium}")

    println("serviciosBasicos set: ${serviciosBasicos}")
    println("serviciosPremium set: ${serviciosPremium}")

    println("Set Mutable")

    val tiposServicio = mutableSetOf("velacion", "cremacion", "traslado")
    println(tiposServicio)

    tiposServicio.add("velacion")
    tiposServicio.add("inhumacion")
    tiposServicio.remove("traslado")

    println(tiposServicio)

    println("verificar si elemento existe ${"velacion" in tiposServicio}")
    println("verificar si elemento existe ${"traslado" in tiposServicio}")
}

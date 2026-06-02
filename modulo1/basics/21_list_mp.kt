fun main() {
    println("Listas")

    val servicios = listOf("velacion", "cremacion", "inhumacion", "cremacion", "embalsamamiento")

    println("Size: ${servicios.size}")
    println("Mostrar el elemento indice 0: ${servicios[0]}")
    println("Mostrar el primer elemento: ${servicios.first()}")
    println("Mostrar el ultimo elemento: ${servicios.last()}")

    println("Mostrar el elemento indice 2: ${servicios.get(2)}")
    println("Mostrar indice contenido elemento: ${servicios.indexOf("cremacion")}")

    println("Verificar existencia de elemento: ${servicios.contains("inhumacion")}")
    println("Verificar existencia de un elemento: ${"cremacion" in servicios}")

    println("Sublista: ${servicios.subList(1, 3)}")
    println("Tomar primeros 2 elementos: ${servicios.take(2)}")
    println("Suprimir tres primeros elementos: ${servicios.drop(3)}")
    println("Tomar los ultimos dos elementos: ${servicios.takeLast(2)}")

    for (servicio in servicios) {
        println(servicio)
    }

    println("lista mutable")

    val salas = mutableListOf("sala_a", "sala_b", "sala_c", "capilla")

    for (sala in salas) {
        println(sala)
    }

    salas.add("sala_vip")
    for (sala in salas) {
        println(sala)
    }

    salas.add(0, "sala_principal")
    for (sala in salas) {
        println(sala)
    }

    salas.remove("sala_vip")
    for (sala in salas) {
        println(sala)
    }

    salas[1] = "sala_reformada"
    for (sala in salas) {
        println(sala)
    }
    println("Array deque")
    val deque = ArrayDeque<Int>()
    println(deque)
    deque.addFirst(1)
    println(deque)
    deque.addLast(2)
    println(deque)
    deque.addLast(3)
    println(deque)
    deque.removeFirst()
    println(deque)
    deque.removeLast()
    println(deque)
}

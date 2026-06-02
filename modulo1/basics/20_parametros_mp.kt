fun main() {
    println("Parametros")
    registrarServicio("Velacion", 1500.0)
    registrarServicio("Cremacion", 1200.0, true)
    println(calcularTotal("Inhumacion", 1800.0, 10.0))
    imprimirResumen(nombre = "Carlos Mendoza", servicio = "Velacion", costo = 1500.0)
}

fun registrarServicio(tipo: String, costo: Double, urgente: Boolean = false) {
    val prioridad = if (urgente) "URGENTE" else "Normal"
    println("Servicio: $tipo | Costo: $costo GTQ | Prioridad: $prioridad")
}

fun calcularTotal(servicio: String, costo: Double, descuento: Double = 0.0): Double {
    return costo - (costo * descuento / 100)
}

fun imprimirResumen(nombre: String, servicio: String, costo: Double) {
    println("Resumen - Difunto: $nombre | Servicio: $servicio | Total: $costo GTQ")
}

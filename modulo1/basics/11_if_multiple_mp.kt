fun main() {
    println("Controles de flujo")
    println("Condicional if - múltiples condiciones")
    println("Ingrese el monto del servicio funerario:")
    val monto = readLine()?.toIntOrNull() ?: 0

    val clasificacion = if (monto <= 500) {
        "Servicio Básico"
    } else if (monto <= 1500) {
        "Servicio Estándar"
    } else if (monto <= 3000) {
        "Servicio Preferencial"
    } else if (monto <= 5000) {
        "Servicio Premium"
    } else if (monto <= 10000) {
        "Servicio Exclusivo"
    } else {
        "Servicio de Lujo Personalizado"
    }

    println("Clasificación: $clasificacion")
}
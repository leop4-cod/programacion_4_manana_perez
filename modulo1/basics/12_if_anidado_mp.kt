fun main() {
    println("Controles de flujo")

    println("Condicional if - anidado")
    println("¿Tiene plan funerario contratado? (s/n)")
    val tienePlan = readLine()?.trim()?.lowercase() == "s"

    println("Monto del servicio:")
    val monto = readLine()?.toIntOrNull() ?: 0

    if (tienePlan) {
        println("Cliente con plan funerario")
        if (monto < 1000) {
            println("Aplica plan básico")
        } else if (monto > 5000) {
            println("Aplica plan premium con beneficios adicionales")
        } else {
            println("Aplica plan estándar") 
        }
    } else {
        println("Cliente sin plan funerario")
        if (monto < 1000 || monto > 5000) {
            println("Monto fuera de promociones vigentes")
        } else {
            println("Monto dentro de tarifa regular")
        }
    }
}
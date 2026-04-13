fun main() {

    println("Operadores aritméticos - Servicios Funerarios")
    val costoAtaud = 1000
    val cantidadServicios = 2

    println("Suma")
    println("$costoAtaud + $cantidadServicios = ${costoAtaud + cantidadServicios}")

    println("Resta")
    println("$costoAtaud - $cantidadServicios = ${costoAtaud - cantidadServicios}")

    println("Multiplicacion")
    println("$costoAtaud * $cantidadServicios = ${costoAtaud * cantidadServicios}")

    println("Division")
    println("$costoAtaud / $cantidadServicios = ${costoAtaud / cantidadServicios}")

    println("Modulo")
    println("$costoAtaud % $cantidadServicios = ${costoAtaud % cantidadServicios}")
    
    println("Operadores de asignacion compuesta")
    var ingresos = 10000
    ingresos += 500 
    println("ingresos += $ingresos")
    ingresos -= 300
    println("ingresos -= $ingresos")
    ingresos *= 2
    println("ingresos *= $ingresos")
    ingresos /= 4
    println("ingresos /= $ingresos")
    ingresos %= 3
    println("ingresos %= $ingresos")

    // incremento o decremento
    ingresos++
    println("ingresos++ $ingresos")
    ingresos--
    println("ingresos-- $ingresos")

}
class Ataud(val largo: Double, val ancho: Double) {
    val volumen:   Double get() = largo * ancho * 0.6
    val perimetro: Double get() = 2 * (largo + ancho)

    constructor(lado: Double) : this(lado, lado)
    constructor(largo: Int, ancho: Int) : this(largo.toDouble(), ancho.toDouble())

    override fun toString() = "Ataúd(${largo}x${ancho}) | volumen=${volumen}"
}

fun main() {
    val a1 = Ataud(2.0, 0.8)
    val a2 = Ataud(1.5)
    val a3 = Ataud(2, 1)

    println(a1)
    println(a2)
}

class Vehiculo(val placa: String)

open class VehiculoFunerario(val placa: String, val tipo: String) {
    open fun describir() = println("$placa es un $tipo")
    open fun descripcion() = "Vehículo: $placa"

    fun revisarMotor() = println("$placa: motor revisado")
}

class Carroza(placa: String) : VehiculoFunerario(placa, "Carroza fúnebre") {
    override fun describir() {
        super.describir()
        println("(decorada con flores blancas)")
    }
    override fun descripcion() = "${super.descripcion()}, una carroza"
}

class Ambulancia(placa: String, val conCamaFria: Boolean) : VehiculoFunerario(placa, "Ambulancia") {
    override fun descripcion() =
        "${super.descripcion()}, ambulancia ${if (conCamaFria) "con cámara fría" else "estándar"}"
}

fun main() {
    val carroza = Carroza("FUN-001")
    carroza.describir()

    val ambulancia = Ambulancia("FUN-002", true)
    println(ambulancia.descripcion())

    carroza.revisarMotor()
}

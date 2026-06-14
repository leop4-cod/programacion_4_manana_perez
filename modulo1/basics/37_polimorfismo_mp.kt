interface MetodoPago {
    fun procesar(monto: Double): Boolean
    val nombre: String
}

class TarjetaCredito(val numero: String) : MetodoPago {
    override val nombre = "Tarjeta de crédito"
    override fun procesar(monto: Double): Boolean {
        println("💳 Cargando $${"%.2f".format(monto)} a $numero")
        return true
    }
}

class TransferenciaBancaria(val cuentaDestino: String) : MetodoPago {
    override val nombre = "Transferencia bancaria"
    override fun procesar(monto: Double): Boolean {
        println("🏦 Transfiriendo $${"%.2f".format(monto)} a cuenta $cuentaDestino")
        return true
    }
}

class Efectivo : MetodoPago {
    override val nombre = "Efectivo"
    override fun procesar(monto: Double): Boolean {
        println("💵 Recibiendo $${"%.2f".format(monto)} en efectivo")
        return true
    }
}

class Cheque(val numeroDeCheque: String) : MetodoPago {
    override val nombre = "Cheque"
    override fun procesar(monto: Double): Boolean {
        println("📄 Recibiendo $${"%.2f".format(monto)} en cheque #$numeroDeCheque")
        return true
    }
}

fun cobrarServicioFunerario(monto: Double, metodoPago: MetodoPago) {
    println("Procesando pago con ${metodoPago.nombre}...")
    val exito = metodoPago.procesar(monto)
    println(if (exito) "✅ Pago exitoso" else "❌ Pago fallido")
}

fun main() {
    val metodos: List<MetodoPago> = listOf(
        TarjetaCredito("**** **** **** 5678"),
        TransferenciaBancaria("GT82-0001-0000-1234"),
        Efectivo(),
        Cheque("4521")
    )

    metodos.forEach { cobrarServicioFunerario(2500.0, it) }
    for(pago in metodos){
        println("método de pago: ${pago.nombre}")
    }

}

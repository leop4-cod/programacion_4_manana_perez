class RegistroFunerario(titular: String, saldoInicial: Double) {

    val titular: String = titular

    private var saldo: Double = saldoInicial

    internal val numeroRegistro: String =
        "FUN${(100000..999999).random()}"

    protected open fun calcularGastos(): Double = saldo * 0.02

    fun depositar(monto: Double) {
        require(monto > 0) { "El monto debe ser positivo" }
        saldo += monto
        println("Abono recibido: $${"%.2f".format(monto)} | Saldo actual: ${consultarSaldo()}")
    }

    fun retirar(monto: Double): Boolean {
        require(monto > 0) { "El monto debe ser positivo" }
        if (monto > saldo) {
            println("Fondos insuficientes")
            return false
        }
        saldo -= monto
        println("Pago realizado: $${"%.2f".format(monto)} | Saldo actual: ${consultarSaldo()}")
        return true
    }

    fun consultarSaldo(): String = "$${"%.2f".format(saldo)}"
}

fun main() {
    val registro = RegistroFunerario("Carlos Mendoza", 1000.0)

    registro.depositar(500.0)
    registro.retirar(200.0)
    registro.retirar(2000.0)

    println(registro.titular)
    println(registro.consultarSaldo())
}

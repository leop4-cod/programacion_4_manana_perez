class RegistroFunerario {
  final String titular;
  double _saldo;

  RegistroFunerario(this.titular, double saldoInicial)
      : _saldo = saldoInicial;

  double get saldo => _saldo;

  void depositar(double monto) {
    if (monto <= 0) throw ArgumentError('El monto debe ser positivo');
    _saldo += monto;
    print('Abono de \$$monto. Saldo actual: \$$_saldo');
  }

  void retirar(double monto) {
    if (monto <= 0)     throw ArgumentError('El monto debe ser positivo');
    if (monto > _saldo) throw StateError('Saldo insuficiente');
    _saldo -= monto;
    print('Pago de \$$monto. Saldo actual: \$$_saldo');
  }
}

void main() {
  final registro = RegistroFunerario('Familia Mendoza', 3000.0);

  registro.depositar(500.0);
  registro.retirar(1200.0);
  print(registro.saldo);
}

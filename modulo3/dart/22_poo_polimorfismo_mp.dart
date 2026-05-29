abstract class ServicioPoli {
  String get nombre;
  double calcularCosto();
}

class Velacion extends ServicioPoli {
  final int horas;
  Velacion(this.horas);
  @override String get nombre => 'Velacion';
  @override double calcularCosto() => horas * 150.0;
}

class Inhumacion extends ServicioPoli {
  final String tipoParcela;
  final double costoBase;
  Inhumacion(this.tipoParcela, this.costoBase);
  @override String get nombre => 'Inhumacion';
  @override double calcularCosto() => costoBase;
}

class Cremacion extends ServicioPoli {
  final double radio;
  Cremacion(this.radio);
  @override String get nombre => 'Cremacion';
  @override double calcularCosto() => 1200.0 + radio * 10;
}

void imprimirCosto(ServicioPoli servicio) {
  print('${servicio.nombre}: Q${servicio.calcularCosto().toStringAsFixed(2)}');
}

void main() {
  final servicios = <ServicioPoli>[
    Velacion(24),
    Inhumacion('Premium', 3500.0),
    Cremacion(5),
  ];

  for (final s in servicios) {
    imprimirCosto(s);
  }

  final masCostoso = servicios.reduce((a, b) => a.calcularCosto() > b.calcularCosto() ? a : b);
  print('\nServicio mas costoso: ${masCostoso.nombre}');
}

abstract class ServicioBase {
  String get nombre;
  double calcularCosto();
  int    calcularDuracionHoras();

  void describir() {
    print('$nombre — costo: Q${calcularCosto().toStringAsFixed(2)}, '
          'duracion: ${calcularDuracionHoras()}h');
  }
}

class Velacion extends ServicioBase {
  final int horas;
  Velacion(this.horas);

  @override String get nombre => 'Velacion (${horas}h)';
  @override double calcularCosto()          => horas * 150.0;
  @override int    calcularDuracionHoras()  => horas;
}

class Cremacion extends ServicioBase {
  final bool conUrna;
  Cremacion(this.conUrna);

  @override String get nombre => 'Cremacion ${conUrna ? "con urna" : "sin urna"}';
  @override double calcularCosto()         => conUrna ? 1800.0 : 1200.0;
  @override int    calcularDuracionHoras() => 4;
}

void main() {
  final servicios = <ServicioBase>[Velacion(24), Cremacion(true)];
  for (final s in servicios) {
    s.describir();
  }
}

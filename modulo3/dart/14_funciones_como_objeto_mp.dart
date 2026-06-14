double aplicarIva(double n)      => n * 1.12;
double aplicarDescuento(double n) => n * 0.90;

void main() {
  double Function(double) operacion;

  operacion = aplicarIva;
  print(operacion(1500));

  operacion = aplicarDescuento;
  print(operacion(1500));

  final transformaciones = <double Function(double)>[aplicarIva, aplicarDescuento];
  for (final fn in transformaciones) {
    print(fn(2000));
  }
}

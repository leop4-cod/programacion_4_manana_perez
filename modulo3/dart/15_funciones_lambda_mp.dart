void main() {
  final calcularIva = (double costo) => costo * 0.12;
  print(calcularIva(1500.0));

  final calcularDescuento = (double costo, double pct) {
    final descuento = costo * (pct / 100);
    return costo - descuento;
  };
  print(calcularDescuento(2000.0, 15.0));

  final costos = [1500.0, 800.0, 2500.0, 1200.0, 3000.0, 600.0, 1800.0, 950.0];
  costos.sort((a, b) => b.compareTo(a));
  print(costos);
}

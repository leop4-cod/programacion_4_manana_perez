void main() {
  final costos = [1500.0, 800.0, 1200.0, 2500.0];

  final costosConIva = costos.map((c) => c * 1.12);
  print(costosConIva.toList());

  final servicios = ['velacion', 'cremacion', 'inhumacion'];
  final rutasServicio = servicios.map((s) => 'funeraria.com/servicios/$s');
  print(rutasServicio.toList());

  final cobros = [1500.0, 2300.0, 980.0, 3100.0, 750.0];

  final total = cobros.reduce((acum, cobro) => acum + cobro);
  print('Total cobrado: \$${total.toStringAsFixed(2)}');

  final totalFold = cobros.fold(0.0, (acum, cobro) => acum + cobro);
  print('Total (fold): \$${totalFold.toStringAsFixed(2)}');

  final maximo = cobros.reduce((a, b) => a > b ? a : b);
  print('Servicio mas costoso: \$$maximo');
}

void main() {
  final servicios = ['Velacion', 'Cremacion', 'Inhumacion', 'Traslado', 'Embalsamamiento'];

  for (final servicio in servicios) {
    print(servicio);
  }

  servicios.forEach((s) => print(s.toLowerCase()));

  final tarifas = {'Velacion': 1500, 'Cremacion': 1200, 'Inhumacion': 1800, 'Traslado': 600};
  for (final entrada in tarifas.entries) {
    print('${entrada.key} → Q${entrada.value}');
  }
}

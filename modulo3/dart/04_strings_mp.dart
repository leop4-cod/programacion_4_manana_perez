void main() {
  final nombreFamilia = 'Mendoza';
  final costoServicio = 2500;

  print('Familia: $nombreFamilia');

  print('${nombreFamilia.toUpperCase()} debe pagar ${costoServicio + 300} con extras');

  final contrato = '''
Familia: $nombreFamilia
Costo:   $costoServicio
Urgente: ${costoServicio > 2000 ? 'Sí' : 'No'}
  ''';
  print(contrato);

  final ruta = r'C:\Funeraria\Contratos\CF-001';
  print(ruta);

  final saludo = 'Bienvenido, familia ' + nombreFamilia + '!';

  print('velacion'.toUpperCase());
  print('  Funeraria La Paz  '.trim());
  print('Funeraria'.contains('Fun'));
  print('Funeraria'.replaceAll('a', 'A'));
  print('velacion,cremacion,inhumacion'.split(','));
  print('Funeraria'.substring(0, 4));
  print('Funeraria'.startsWith('Fun'));
  print('CF1'.padLeft(6, '0'));
}

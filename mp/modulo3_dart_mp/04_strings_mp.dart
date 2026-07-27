void main() {
  final director = 'Ana';
  final asistentes = 28;

  print('Bienvenida, $director');

  print('${director.toUpperCase()} opera con ${asistentes + 1} asistentes mañana');

  final informe = '''
Servicio:      $director
Asistentes: $asistentes
Activa:    ${asistentes >= 1 ? 'Sí' : 'No'}
  ''';
  print(informe);

  final servicio = r'C:\Transportes\Linea5';
  print(servicio);

  final mensaje = 'Bienvenido, ' + director + '!';

  print('metro'.toUpperCase());
  print('  Bus  '.trim());
  print('Coche Fúnebre'.contains('bus'));
  print('Tranvía'.replaceAll('v', 'V'));
  print('L1,L2,L3'.split(','));
  print('Estación'.substring(0, 4));
  print('Estación'.startsWith('Est'));
  print('123'.padLeft(5, '0'));
} 
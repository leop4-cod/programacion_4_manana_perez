void main() {
  List<String> servicios  = ['velacion', 'cremacion', 'inhumacion'];
  var          costos     = [1500, 1200, 1800];

  print(servicios[0]);
  print(servicios.length);
  servicios.add('embalsamamiento');
  servicios.remove('cremacion');

  Map<String, int> capacidadSalas = {
    'Sala A':   30,
    'Sala B':   50,
    'Capilla':  80,
  };

  print(capacidadSalas['Sala A']);
  print(capacidadSalas['Sala D']);
  capacidadSalas['Sala VIP'] = 20;

  Set<String> tiposAtaud = {'pino', 'roble', 'metalico'};
  tiposAtaud.add('pino');
  print(tiposAtaud.length);

  var serviciosBasicos = ['velacion', 'ataúd'];
  var serviciosExtra   = ['flores', 'carroza'];
  var paqueteCompleto  = [...serviciosBasicos, ...serviciosExtra];
  print(paqueteCompleto);

  bool incluirUrna = true;
  var items = [
    'velacion',
    'inhumacion',
    if (incluirUrna) 'urna',
  ];

  var numerosContrato = [for (var i = 1; i <= 5; i++) i * i];
  print(numerosContrato);
}

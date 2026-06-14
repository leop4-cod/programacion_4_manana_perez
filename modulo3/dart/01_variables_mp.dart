void main() {
  var nombreDifunto = 'Carlos';
  var diasVelacion  = 2;
  var costoServicio = 1500.99;
  var disponible    = true;

  String tipoServicio = 'Velacion';
  int    capacidadSala = 50;
  double precioAtaud   = 899.99;
  bool   urgente       = false;

  final funeraria = 'Funeraria La Paz';

  const ivaPorcentaje = 12.0;
  const descuentoMax  = 15.0;

  final fechaRegistro = DateTime.now();

  print('$nombreDifunto registrado en $funeraria, servicio: $tipoServicio');
}

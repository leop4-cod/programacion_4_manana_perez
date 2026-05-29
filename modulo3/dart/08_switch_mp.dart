void main() {
  String estadoServicio = 'COMPLETADO';

  switch (estadoServicio) {
    case 'PENDIENTE':
      print('Pendiente');
    case 'EN_PROCESO':
      print('En proceso');
    case 'COMPLETADO':
      print('Completado');
    case 'CANCELADO':
      print('Cancelado');
    case 'RECHAZADO':
      print('Rechazado');
    default:
      print('Estado desconocido');
  }
  String estadoServicio2 = 'COMPLETADO';

  String descripcion = switch (estadoServicio2) {
    'PENDIENTE'   => 'Esperando confirmacion de la familia',
    'EN_PROCESO'  => 'Servicio en curso',
    'COMPLETADO'  => 'Servicio finalizado con exito',
    'CANCELADO'   => 'Cancelado por la familia',
    'RECHAZADO'   => 'No aprobado por la direccion',
    _             => 'Estado desconocido',
  };
  print(descripcion);

  int codigoServicio = 2;

  String tipoServicio = switch (codigoServicio) {
    1 || 2         => 'Servicio de Velacion',
    3 || 4         => 'Servicio de Cremacion',
    5 || 6 || 7   => 'Servicio de Inhumacion',
    8 || 9        => 'Servicio de Traslado',
    _              => 'Servicio no registrado',
  };

  print(tipoServicio);

  double costoServicio = 3200.0;

  String alerta = switch (costoServicio) {
    double c when c >= 5000.0 => '🚨 Servicio Exclusivo — requiere aprobacion gerencia',
    double c when c >= 3000.0 => '🔴 Servicio Premium — coordinar con director',
    double c when c >= 1500.0 => '🟡 Servicio Estandar — proceder normalmente',
    double c when c >= 500.0  => '🟢 Servicio Basico',
    _                          => '🔵 Costo no valido — revisar',
  };

  print(alerta);
}

class ServicioFunerario {
  final String id;
  final String nombre;
  String       sala;
  bool         _activo = false;

  ServicioFunerario({
    required this.id,
    required this.nombre,
    required this.sala,
  });

  bool   get activo => _activo;
  String get estado => _activo ? 'en curso' : 'pendiente';

  set estadoActivo(bool valor) {
    _activo = valor;
    print('$nombre: ${valor ? "iniciado" : "finalizado"}');
  }

  void iniciar() {
    _activo = true;
    print('$nombre iniciado en sala $sala');
  }

  void finalizar() {
    _activo = false;
    print('$nombre finalizado');
  }

  String resumen() => 'ID: $id | Servicio: $nombre | Sala: $sala | Estado: $estado';

  @override
  String toString() => 'ServicioFunerario($nombre, $sala, $estado)';
}

void main() {
  final velacion = ServicioFunerario(
    id:     'CF-001',
    nombre: 'Velacion Familia Mendoza',
    sala:   'Sala A',
  );

  velacion.iniciar();
  print(velacion.estado);
  print(velacion.resumen());
  print(velacion);

  velacion.estadoActivo = false;
  print(velacion.activo);
}

class UnidadTransporte {
  final String id;
  final String nombre;
  String servicio;
  bool _enServicio = false;

  UnidadTransporte({
    required this.id,
    required this.nombre,
    required this.servicio,
  });

  bool get enServicio => _enServicio;
  String get estado => _enServicio ? 'activo' : 'inactivo';

  set estadoServicio(bool valor) {
    _enServicio = valor;
    _enServicio ? print('$nombre: en servicio') : print('$nombre: fuera de servicio');
  }

  void conectar() {
    _enServicio = true;
    print('$nombre conectado en servicio $servicio');
  }

  void desconectar() {
    _enServicio = false;
    print('$nombre desconectado');
  }

  String resumen() => 'ID: $id | Nombre: $nombre | Servicio: $servicio | Estado: $estado';

  @override
  String toString() => 'UnidadTransporte($nombre, $servicio, $estado)';
}

void main() {
  final cocheFunebre = UnidadTransporte(
    id: 'FUN-001',
    nombre: 'vehiculo-principal',
    servicio: 'Cremación',
  );

  cocheFunebre.conectar();
  print(cocheFunebre.estado);
  print(cocheFunebre.resumen());
  print(cocheFunebre);

  cocheFunebre.estadoServicio = false;
  print(cocheFunebre.enServicio);
}
class VehiculoFunerario {
  final String placa;
  final int    anioFabricacion;

  VehiculoFunerario(this.placa, this.anioFabricacion);

  String describir() => '...';

  void presentarse() {
    print('Placa: $placa, año: $anioFabricacion, tipo: ${describir()}');
  }
}

class Carroza extends VehiculoFunerario {
  Carroza(super.placa, super.anioFabricacion);

  @override
  String describir() => 'Carroza funebre';

  void decorar() => print('$placa decorada con flores blancas 💐');
}

class Ambulancia extends VehiculoFunerario {
  Ambulancia(super.placa, super.anioFabricacion);

  @override
  String describir() => 'Ambulancia funeraria';

  void activarSirena() => print('$placa activa sirena 🚨');
}

void main() {
  final carroza    = Carroza('FUN-001', 2020);
  final ambulancia = Ambulancia('FUN-002', 2022);

  carroza.presentarse();
  ambulancia.presentarse();

  carroza.decorar();
  ambulancia.activarSirena();
}

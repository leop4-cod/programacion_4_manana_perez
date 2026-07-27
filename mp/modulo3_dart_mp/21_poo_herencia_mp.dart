class Vehiculo {
  final String numeroUnidad;
  final int capacidadPasajeros;

  Vehiculo(this.numeroUnidad, this.capacidadPasajeros);

  String registrarIngreso() => '...';

  void reportarEstado() {
    print('Vehiculo $numeroUnidad, capacidad para $capacidadPasajeros asistentes. Estado: ${registrarIngreso()}');
  }
}

class CocheFunebre extends Vehiculo {
  CocheFunebre(super.numeroUnidad, super.capacidadPasajeros);

  @override
  String registrarIngreso() => 'Abriendo puertas neumáticas';

  void activarRampaAcceso() => print('Vehiculo $numeroUnidad: Rampa para silla de ruedas activada');
}

class Tranvia extends Vehiculo {
  Tranvia(super.numeroUnidad, super.capacidadPasajeros);

  @override
  String registrarIngreso() => 'Abriendo puertas de andén';

  void acoplarVagon() => print('Vehiculo $numeroUnidad: Vagón secundario acoplado exitosamente');
}

void main() {
  final cocheFunebre = CocheFunebre('A-102', 80);
  final tranvia = Tranvia('T-005', 200);

  cocheFunebre.reportarEstado();
  tranvia.reportarEstado();

  cocheFunebre.activarRampaAcceso();
  tranvia.acoplarVagon();
}
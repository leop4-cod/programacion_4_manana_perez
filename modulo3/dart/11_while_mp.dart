import 'dart:io';

void main() {
  int serviciosProcesados = 0;
  int capacidadSala       = 5;

  while (capacidadSala > 0) {
    final ocupados = capacidadSala > 2 ? 2 : capacidadSala;
    serviciosProcesados++;
    capacidadSala -= ocupados;
    print('Servicio $serviciosProcesados: $ocupados lugares ocupados (restante: $capacidadSala)');
  }

  int intentos = 0;
  bool contratoFirmado = false;

  do {
    intentos++;
    print('Intento de contacto con la familia #$intentos...');
    if (intentos == 3) contratoFirmado = true;
  } while (!contratoFirmado && intentos < 5);

  print(contratoFirmado
      ? 'Contrato firmado tras $intentos intentos'
      : 'No se pudo contactar a la familia');
}

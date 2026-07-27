void main() {
  int asistentes = 38;

  if (asistentes > 50) {
    print('Sobrecupo');
  } else if (asistentes > 20) {
    print('Normal');
  } else {
    print('Bajo');
  }

  String estado = asistentes > 50 ? 'Sobrecargado' : 'Capacidad adecuada';
  print(estado);

  String linea = 'Paquete Funerario 1';
  String display = linea.toUpperCase();
  print(display);

  String display2 = linea.toUpperCase();
  print(display2);

  String destino = 'Destino Final';
  print(destino.length);
  print(destino.length);

  int longitud = destino.length;
  print(longitud);
}


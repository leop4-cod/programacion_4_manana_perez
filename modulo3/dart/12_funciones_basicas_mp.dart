import 'dart:io';

int sumar(int a, int b) {
  return a + b;
}

int multiplicar(int a, int b) => a * b;

void imprimirSeparador(String titulo) {
  print('─── $titulo ───');
}


void main() {
  print(sumar(1500, 300));
  print(multiplicar(2, 500));
  imprimirSeparador('Funeraria La Paz');
}

String formatearCosto(double costo) => 'Q${costo.toStringAsFixed(2)}';

formatearCostoSinTipo(double costo) => 'Q${costo.toStringAsFixed(2)}';

void main2() {
  print(formatearCosto(1299.9));
}

String construirRutaServicio(String funeraria, String servicio, [int? sala]) {
  if (sala != null) {
    return '$funeraria/sala$sala/$servicio';
  }
  return '$funeraria/$servicio';
}

String construirRutaV2(String funeraria, String servicio, [int sala = 1]) {
  return '$funeraria/sala$sala/$servicio';
}

void main3() {
  print(construirRutaServicio('FunerariaLaPaz', 'velacion'));
  print(construirRutaServicio('FunerariaLaPaz', 'velacion', 2));
  print(construirRutaV2('FunerariaLaPaz', 'cremacion'));
}

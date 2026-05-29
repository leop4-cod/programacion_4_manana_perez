import 'dart:io';

void main(){
  print('Ingrese el nombre de la familia: ');
  String? nombreFamilia = stdin.readLineSync();
  print('Familia registrada: $nombreFamilia');
  print('Ingrese el numero de difuntos:');
  int numeroDifuntos = int.parse(stdin.readLineSync()!);
  print('Difuntos: $numeroDifuntos');

  print('Ingrese el costo del servicio:');
  double costoServicio = double.parse(stdin.readLineSync()!);
  print('Costo del servicio: $costoServicio');

  print('Ingrese el costo de la velacion:');
  int a = int.parse(stdin.readLineSync()!);
  print('Ingrese el costo del ataud:');
  int b = int.parse(stdin.readLineSync()!);
  int total = a + b;
  print('El total de velacion y ataud: $total');


}

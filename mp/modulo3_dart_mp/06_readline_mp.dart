import 'dart:io';

void main(){
  print('Ingrese el nombre del director: ');
  String? director = stdin.readLineSync();
  print('Director: $director');
  print('Ingrese la cantidad de asistentes:');
  int cantidad = int.parse(stdin.readLineSync()!);
  print('Asistentes: $cantidad');

  print('Ingrese la distancia en km:');
  double distancia = double.parse(stdin.readLineSync()!);
  print('Distancia: $distancia'); 

  print('Ingrese el primer horario:');
  int horario1 = int.parse(stdin.readLineSync()!);
  print('Ingrese el segundo horario:');
  int horario2 = int.parse(stdin.readLineSync()!);
  int totalHorarios = horario1 + horario2;
  print('La suma de $horario1 y $horario2 es: $totalHorarios');
}




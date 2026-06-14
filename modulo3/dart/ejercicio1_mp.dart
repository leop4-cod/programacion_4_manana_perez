import 'dart:io';

void main(){
    int serviciosRegistrados = 0;
    print('Ingrese la cantidad de servicios del dia: ');
    
    while (true) {
        int cant = int.parse(stdin.readLineSync()!);
        if (cant == 0){
         break;
        
    }
    serviciosRegistrados++;
    
  }
    if(serviciosRegistrados < 5){
            print('Demanda adecuada');
        }
        else{
            print('Alta demanda — reforzar personal');
        }
}

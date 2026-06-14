import 'dart:io';

void main(){
    double horasServicio = 0;
    int cantAtaudes = 0;
    int cantSalas = 0;

    while(true){
        print('Cantidad de ataudes preparados: ');
        int cant = int.parse(stdin.readLineSync()!);
        print('Horas de servicio: ');
        double horas = double.parse(stdin.readLineSync()!);

        if(horas == 0){
            break;
        }

        cantAtaudes += cant;
        cantSalas ++;
        horasServicio += horas;

    }
    if(cantAtaudes >= 2 && cantAtaudes <= 4 * horasServicio){
        print('Demanda normal');
    }
    else if(cantAtaudes > 4 * horasServicio){
        print('Demanda alta');
    }
    else{
        print('Demanda baja');
    }

    print('Total ataudes preparados: $cantAtaudes');
    print('Cantidad de salas ocupadas: $cantSalas');
    double promedio = cantAtaudes / cantSalas;
    print('Promedio de ataudes por sala: $promedio');
    print('Horas totales de servicio: $horasServicio');
}

import 'dart:io';

void main(){
    int totalServicios = 0;
    int cantidadContratos = 0;

    print('Ingrese costo de servicio: ');
    
    while(true){
        int cant = int.parse(stdin.readLineSync()!);
        if(cant == 0){
            break;
        }
        totalServicios += cant;
        cantidadContratos++;
    }

    if(totalServicios >= 10000){

        print('Recaudacion excelente');
    }
    else if(totalServicios >= 5000 && totalServicios <= 10000){
        print('Recaudacion normal');
    } 
    else{
        print('Recaudacion Baja');
    }

print('Contratos Registrados: $cantidadContratos');
double promedio = cantidadContratos / totalServicios;
print('Promedio: $promedio');
print('Total recaudado: $totalServicios');

    
}

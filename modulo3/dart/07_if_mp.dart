void main() {
  int costoServicio = 1800;

  if (costoServicio > 2000) {
    print('Servicio Premium');
  } else if (costoServicio > 1000) {
    print('Servicio Estandar');
  } else {
    print('Servicio Basico');
  }

  String categoria = costoServicio > 2000 ? 'Premium' : 'Estandar';
  print(categoria);

  String? sala;
  String display = sala != null ? sala.toUpperCase() : 'Sin sala asignada';

  String display2 = sala?.toUpperCase() ?? 'Sin sala asignada';
  print(display2);
}

void main2() {
  String? nombreFamilia;

  if (nombreFamilia != null) {
    print(nombreFamilia.length);
  }

  print(nombreFamilia?.length);

  int longitud = nombreFamilia?.length ?? 0;
  print(longitud);
}

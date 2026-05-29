void registrarServicio({
  required String nombreFamilia,
  required String tipoServicio,
  bool   urgente     = false,
  int    diasPlazo   = 3,
}) {
  final prioridad = urgente ? 'URGENTE' : 'Normal';
  print('Familia: $nombreFamilia | Servicio: $tipoServicio | Prioridad: $prioridad | Plazo: ${diasPlazo}d');
}

void main() {
  registrarServicio(
    nombreFamilia: 'Familia Mendoza',
    tipoServicio:  'Velacion',
    urgente:       true,
    diasPlazo:     1,
  );

  registrarServicio(
    nombreFamilia: 'Familia Garcia',
    tipoServicio:  'Cremacion',
  );
}

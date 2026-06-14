void main() {
  String nombreDifunto = 'Carlos Mendoza';

  String? nombreFamilia = null;
  nombreFamilia = 'Familia Mendoza';

  String? sala;

  print(sala?.length);

  String resultado = sala ?? 'Sin sala asignada';
  print(resultado);

  String salaSegura = sala!;

  if (nombreFamilia != null) {
    print(nombreFamilia.length);
  }

  late String codigoContrato;
  codigoContrato = 'CF-001';
  print(codigoContrato);
}

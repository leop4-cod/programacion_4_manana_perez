void main() {
  int    diasVelacion = 2;
  double costoTotal   = diasVelacion.toDouble();
  String texto        = diasVelacion.toString();

  int    num1 = int.parse('1500');
  double num2 = double.parse('899.99');

  int?    num3 = int.tryParse('abc');
  double? num4 = double.tryParse('1200');

  Object valor = 'CF-001';
  if (valor is String) {
    print(valor.length);
  }

  Object obj = 'Velacion';
  String str = obj as String;

  String? codigoContrato = null;
  int longitud = codigoContrato?.length ?? 0;
  print(longitud);

  print(double.infinity);
  print(double.nan);
  print(double.maxFinite);
}

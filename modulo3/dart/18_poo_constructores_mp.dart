class ContratoFunerario {
  final String nombreFamilia;
  final String tipoServicio;
  final double costo;
  final bool   urgente;

  ContratoFunerario({
    required this.nombreFamilia,
    required this.tipoServicio,
    required this.costo,
    this.urgente = false,
  });

  ContratoFunerario.basico()
      : nombreFamilia = 'Sin nombre',
        tipoServicio  = 'Velacion',
        costo         = 800.0,
        urgente       = false;

  ContratoFunerario.premium({required this.nombreFamilia, required this.tipoServicio})
      : costo   = 5000.0,
        urgente = true;

  factory ContratoFunerario.desdeCodigo(String codigo) {
    final partes = codigo.split('-');
    return ContratoFunerario(
      nombreFamilia: partes[0],
      tipoServicio:  partes.length > 1 ? partes[1] : 'Velacion',
      costo:         partes.length > 2 ? double.tryParse(partes[2]) ?? 1500.0 : 1500.0,
      urgente:       false,
    );
  }

  @override
  String toString() =>
      '${urgente ? "URGENTE" : "Normal"} — $nombreFamilia: $tipoServicio (Q$costo)';
}

void main() {
  final c1 = ContratoFunerario(nombreFamilia: 'Familia Mendoza', tipoServicio: 'Cremacion', costo: 1200.0);
  final c2 = ContratoFunerario.basico();
  final c3 = ContratoFunerario.premium(nombreFamilia: 'Familia Torres', tipoServicio: 'Inhumacion');
  final c4 = ContratoFunerario.desdeCodigo('Familia-Garcia-Velacion-1500');

  print(c1);
  print(c2);
  print(c3);
  print(c4);
}

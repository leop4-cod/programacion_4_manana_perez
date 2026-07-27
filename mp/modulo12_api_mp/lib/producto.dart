class Ataud {
  final int     id;
  final String  nombre;
  final double  precio;
  final bool    activo;
  final String? categoria;

  const Ataud({
    required this.id,
    required this.nombre,
    required this.precio,
    required this.activo,
    this.categoria,
  });
}
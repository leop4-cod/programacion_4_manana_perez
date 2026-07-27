import os
import re

directories = [
    r"d:\programacion_4_manana_perez\modulo_1\basics\mp",
    r"d:\programacion_4_manana_perez\modulo_3\dart\mp",
    r"d:\programacion_4_manana_perez\modulo_3\flutter\modulo06_widgets_mp",
    r"d:\programacion_4_manana_perez\modulo_3\flutter\modulo09_formularios_mp",
    r"d:\programacion_4_manana_perez\modulo_3\flutter\modulo10_riverpod_mp",
    r"d:\programacion_4_manana_perez\modulo_3\flutter\modulo11_gorouter_mp",
    r"d:\programacion_4_manana_perez\modulo_3\flutter\modulo12_api_mp"
]

replacements = {
    r'\bAutobús\b': 'Coche Fúnebre',
    r'\bautobús\b': 'coche fúnebre',
    r'\bAutobus\b': 'CocheFunebre',
    r'\bautobus\b': 'cocheFunebre',
    r'\bunidad\b': 'vehiculo',
    r'\bUnidad\b': 'Vehiculo',
    r'\bUnidades\b': 'Vehiculos',
    r'\bunidades\b': 'vehiculos',
    r'\bConductor\b': 'Director',
    r'\bconductor\b': 'director',
    r'\bConductores\b': 'Directores',
    r'\bconductores\b': 'directores',
    r'\bPasajero\b': 'Difunto',
    r'\bpasajero\b': 'difunto',
    r'\bPasajeros\b': 'Asistentes',
    r'\bpasajeros\b': 'asistentes',
    r'\bRuta\b': 'Servicio',
    r'\bruta\b': 'servicio',
    r'\bRutas\b': 'Servicios',
    r'\brutas\b': 'servicios',
    r'\bTarifa\b': 'Costo',
    r'\btarifa\b': 'costo',
    r'\bSistemaTransporte\b': 'GestorFunerario',
    r'\bsistemaTransporte\b': 'gestorFunerario',
    r'Autobús Línea 10': 'Cortejo Fúnebre',
    r'BUS-': 'FUN-',
    r'Línea (\d+)': r'Paquete Funerario \1',
    r'Troncal Central': 'Cremación',
    r'Alimentador Norte': 'Entierro Tradicional',
    r'Expreso Sur': 'Repatriación',
    r'estacionVisible': 'salaVelacionVisible',
    r'\bEstacion\b': 'Sala',
    r'\bestacion\b': 'sala',
    r'\bkilometraje\b': 'horasServicio',
    r'\bKilometraje\b': 'HorasServicio',
    
    r'nginx-proxy': 'Horno Crematorio',
    r'Intentos de login': 'Trámites Activos',
    r'Conexiones activas': 'Servicios Funerarios',
    r'Aunque la NOAA.*': 'En Funeraria La Paz acompañamos a las familias en sus momentos más difíciles, brindando un servicio cálido y respetuoso.',
    r'Catálogo': 'Catálogo de Servicios',
    r'Carrito': 'Contrataciones',
    r'\bProducto\b': 'Ataud',
    r'\bproducto\b': 'ataud',
    r'\bProductos\b': 'Ataudes',
    r'\bproductos\b': 'ataudes',
    r'\bUser\b': 'Familiar',
    r'\buser\b': 'familiar',
    r'\bUsers\b': 'Familiares',
    r'\busers\b': 'familiares',
}

for d in directories:
    if not os.path.exists(d):
        continue
    for root, dirs, files in os.walk(d):
        for file in files:
            if file.endswith('.kt') or file.endswith('.dart') or file.endswith('.yaml'):
                path = os.path.join(root, file)
                try:
                    with open(path, 'r', encoding='utf-8') as f:
                        content = f.read()
                    
                    new_content = content
                    for pattern, repl in replacements.items():
                        new_content = re.sub(pattern, repl, new_content)
                    
                    if new_content != content:
                        with open(path, 'w', encoding='utf-8') as f:
                            f.write(new_content)
                except Exception as e:
                    print(f"Failed to process {path}: {e}")

print("Refactoring complete.")

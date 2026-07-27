import os
import re

directories = [
    r"d:\programacion_4_manana_perez\mp\modulo09_formularios_mp\lib",
    r"d:\programacion_4_manana_perez\mp\modulo10_riverpod_mp\lib",
    r"d:\programacion_4_manana_perez\mp\modulo11_gorouter_mp\lib",
    r"d:\programacion_4_manana_perez\mp\modulo12_api_mp\lib",
]

replacements = {
    # UI Texts
    r"'Servidores SSH'": "'Servicios Fúnebres'",
    r"'Servidores'": "'Servicios'",
    r"'Servidor'": "'Servicio Fúnebre'",
    r"'Métricas'": "'Estadísticas'",
    r"'Dashboard'": "'Panel Principal'",
    r"'Detalle de Servidor'": "'Detalle del Servicio'",
    r"'Ajustes'": "'Configuración'",
    r"'Inicio'": "'Inicio'",
    r"'Buscar servidor...'": "'Buscar servicio...'",
    r"'Filtros'": "'Filtros'",
    r"'Estado'": "'Estado'",
    r"'Activo'": "'En Proceso'",
    r"'Inactivo'": "'Finalizado'",
    r"'IP'": "'Matrícula/ID'",
    r"'Puerto'": "'Sucursal'",
    r"'Sistema Operativo'": "'Tipo de Servicio'",
    r"'CPU'": "'Capacidad'",
    r"'RAM'": "'Asistentes'",
    r"'Disco'": "'Duración'",
    r"'Uptime'": "'Tiempo'",
    r"'Ping'": "'Disponibilidad'",
    r"'Usuario'": "'Familiar Responsable'",
    r"'Contraseña'": "'Cédula'",
    r"'Ubuntu 22.04'": "'Catafalco Premium'",
    r"'Debian 11'": "'Ataúd Básico'",
    r"'CentOS 8'": "'Urna para Cenizas'",
    r"'192.168.1.100'": "'TR-402'",
    r"'10.0.0.5'": "'PL-981'",
    r"'172.16.0.10'": "'SUC-Centro'",
    r"'api-gateway'": "'traslado-nacional'",
    r"'backup-worker'": "'carroza-04'",
    r"'database-primary'": "'horno-crematorio'",
    
    # Icons
    r"Icons\.dns": "Icons.church",
    r"Icons\.computer": "Icons.directions_car",
    r"Icons\.memory": "Icons.local_florist",
    r"Icons\.storage": "Icons.inventory",
    r"Icons\.network_check": "Icons.people",
    r"Icons\.wifi": "Icons.check_circle",
    r"Icons\.wifi_off": "Icons.cancel",
    r"Icons\.router": "Icons.directions_car",
    r"Icons\.developer_board": "Icons.book",
    r"Icons\.terminal": "Icons.document_scanner",
    r"Icons\.speed": "Icons.access_time",
    r"Icons\.bar_chart": "Icons.analytics",
    r"Icons\.dashboard": "Icons.home_work",
}

for d in directories:
    for root, dirs, files in os.walk(d):
        for file in files:
            if file.endswith('.dart'):
                filepath = os.path.join(root, file)
                with open(filepath, 'r', encoding='utf-8') as f:
                    content = f.read()
                
                new_content = content
                for pattern, replacement in replacements.items():
                    # We only replace exact matches to avoid breaking code logic
                    new_content = re.sub(pattern, replacement, new_content)
                
                if new_content != content:
                    with open(filepath, 'w', encoding='utf-8') as f:
                        f.write(new_content)
                    print(f"Updated {filepath}")

fun main() {
    val numero1: Byte = 100
    println("Ataúdes en exhibiciin (Byte): $numero1")

    val numero2: Short = 30000 
    println("Servicios realizados en el año (Short): $numero2")

    val numero3: Int = 12 
    println("salas velatorias disponibles (Int): $numero3")

    val numero4: Long = 12122122123123987L 
    println("Registro historico de clientes (Long): $numero4")

    val numero5: Float = 3.14f 
    println("Promedio de días de servicio (Float): $numero5")

    val numero6: Double = 3.1415926535
    println("Calculo financiero detallado (Double): $numero6")
    
   // inferido
   val nombre = "funeraria"
   val empleados = 56

   println("Nombre: $nombre")
   val nombreTipo = nombre::class.simpleName
   println("Tipo inferido nombre: $nombreTipo")
   println("Tipo inferido nombre: ${nombre::class.simpleName}")

   println("Empleados: $empleados")
   val empleadosTipo = empleados::class.simpleName
   println("Tipo inferido empleados: $empleadosTipo")
   println("Tipo inferido empleados: ${empleados::class.simpleName}")
}
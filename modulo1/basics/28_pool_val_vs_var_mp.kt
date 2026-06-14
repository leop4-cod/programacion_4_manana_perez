class AtaudInmutable(val largo: Double, val ancho: Double)

class ContadorDeVelacion(var dias: Int = 0) {
    fun avanzarDia() { dias++ }
    fun reiniciar()  { dias = 0 }
}

class RegistroTemporal(nombreDifunto: String) {
    val nombreUpper = nombreDifunto.uppercase()
}

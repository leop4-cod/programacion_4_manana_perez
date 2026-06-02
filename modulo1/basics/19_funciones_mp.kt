fun main() {
    println("Funciones")
    val bienvenida = bienvenida()
    println("$bienvenida")
    val suma: Int = sumar(5, 4)
    println(suma)
    println(restarTipoExpresion(5,3))
    println(restarTipoInferido(5,3))
    registrarDifunto("Carlos Mendoza")
}

fun bienvenida(): String {
    return "Bienvenido a la Funeraria La Paz"
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun restarTipoExpresion(a: Int, b: Int)=a-b
fun restarTipoInferido(a: Int, b: Int)=a-b
fun registrarDifunto(nombre: String){
    println("Difunto registrado: $nombre")
}

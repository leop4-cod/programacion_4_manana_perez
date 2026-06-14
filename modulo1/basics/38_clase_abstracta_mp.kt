abstract class ServicioBase(val nombre: String) {
    abstract val costo: Double
    abstract val duracionHoras: Int
    abstract fun descripcion(): String

    fun comparar(otro: ServicioBase): String = when {
        costo > otro.costo -> "$nombre es más costoso que ${otro.nombre}"
        costo < otro.costo -> "$nombre es más económico que ${otro.nombre}"
        else               -> "$nombre y ${otro.nombre} tienen el mismo costo"
    }

    override fun toString() = "${descripcion()} | Costo: $${"%.2f".format(costo)}"
}

class Velacion(val horas: Int) : ServicioBase("Velación") {
    override val costo:          Double get() = horas * 150.0
    override val duracionHoras:  Int    get() = horas
    override fun descripcion() = "Velación de $horas horas en sala"
}

class Cremacion(val conUrna: Boolean) : ServicioBase("Cremación") {
    override val costo:          Double get() = if (conUrna) 1800.0 else 1200.0
    override val duracionHoras:  Int    get() = 4
    override fun descripcion() = "Cremación ${if (conUrna) "con urna incluida" else "sin urna"}"
}

class Inhumacion(val tipoParcela: String) : ServicioBase("Inhumación") {
    override val costo:          Double get() = when (tipoParcela) {
        "VIP"      -> 5000.0
        "estándar" -> 2500.0
        else       -> 1500.0
    }
    override val duracionHoras:  Int    get() = 3
    override fun descripcion() = "Inhumación en parcela $tipoParcela"
}

fun main() {
    val servicios: List<ServicioBase> = listOf(
        Velacion(24),
        Cremacion(true),
        Inhumacion("estándar")
    )

    servicios.forEach { println(it) }

    val masCarо = servicios.maxByOrNull { it.costo }
    println("\nServicio más costoso: ${masCarо?.nombre}")

    println(servicios[0].comparar(servicios[1]))
}

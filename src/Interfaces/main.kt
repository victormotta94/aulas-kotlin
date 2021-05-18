package Interfaces

fun main() {
    val saoPaulo = SaoPaulo()
    saoPaulo.impostoXpto()
}

class SaoPaulo : RegraDeOuro {

    override val icms: Double = 9.0

    override fun colherEstadoXpto() {

    }

    override fun colherEstadoXyz() {

    }

    override fun colherEstadoX() {

    }


}

interface RegraDeOuro {

    val icms: Double

    fun colherEstadoXpto()

    fun colherEstadoXyz()

    fun colherEstadoX()

    fun impostoXpto() {
        println("wowe9riuwe")
    }
}

abstract class RegraDePrata {

    val icms = 7.0

    abstract fun colherEstadoXpto1(): Double

    abstract fun colherEstadoXyz1(): String

    abstract fun colherEstadoX1()
}
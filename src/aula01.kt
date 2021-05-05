fun main() {
    val inteiro: Int = 1
    val numeroUltraGrande: Long = 7135767
    val inteiro2 = 2
    val texto = "Victor Motta"
    val ehMaior = true
    val decimalMenor: Float = 2.5f
    val decimalMaior = 2.252334

    val petImutavel = listOf("Cachorro", "Papagaio", "Gato")

    when {
        inteiro < 3 -> println("menor que 3")
    }

    petImutavel.forEach { bicho ->
        println(bicho)
    }
}
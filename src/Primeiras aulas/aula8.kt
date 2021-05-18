package `Primeiras aulas`

fun main() {
    val bichano = Gato()
    bichano.come()
}

class Leao : Animal(
    sexo = "Masculino"
) {

}

class Gato : Animal("Masculino", "Preto") {
    override fun come() {
        println("gato come")
    }
}

class Cachorro : Animal(
    "Feminino",
    "Marrom"
) {

}

open class Animal(
    val sexo: String = "0"
) {
    constructor(sexo: String, cor: String) : this()

    open fun come() {
        println("default")
    }
}
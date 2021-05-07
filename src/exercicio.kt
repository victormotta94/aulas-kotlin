fun main() {
//    println(maiorNumero(2, 3, 8))
    val trab1 = Trabalhador(54, 'M', 40 )
    val trab2 = Trabalhador(64, 'F', 31 )
    val trab3 = Trabalhador(72, 'M', 28 )
    val trab4 = Trabalhador(64, 'M', 40 )

    trab1.verificarContribuicao()
    trab2.verificarContribuicao()
    trab3.verificarContribuicao()
    trab4.verificarContribuicao()
}
//
//fun maiorNumero(numero1: Int, numero2: Int, numero3: Int): Int {
//    when {
//        numero1 > numero2 && numero1 > numero3 -> return numero1
//        numero2 > numero1 && numero2 > numero3 -> return numero2
//        numero3 > numero1 && numero3 > numero2 -> return numero3
//        else -> return 0
//    }
//}

class Trabalhador(val idade: Int, val sexo: Char, val anos: Int) {
    fun verificarContribuicao() {
        if (anos < 30){
        println(false)
    } else if(sexo == 'F' && idade > 59) {
        println(true)
    }else if(sexo =='M' && idade > 64){
        println(true)
    } else {
        println(false)
    }
    }
}

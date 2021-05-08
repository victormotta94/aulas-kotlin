//fun main() {
////    println(maiorNumero(2, 3, 8))
//    val trab1 = Trabalhador(54, 'M', 40 )
//    val trab2 = Trabalhador(64, 'F', 31 )
//    val trab3 = Trabalhador(72, 'M', 28 )
//    val trab4 = Trabalhador(64, 'M', 40 )
//
//    trab1.verificarContribuicao()
//    trab2.verificarContribuicao()
//    trab3.verificarContribuicao()
//    trab4.verificarContribuicao()
//}
////
////fun maiorNumero(numero1: Int, numero2: Int, numero3: Int): Int {
////    when {
////        numero1 > numero2 && numero1 > numero3 -> return numero1
////        numero2 > numero1 && numero2 > numero3 -> return numero2
////        numero3 > numero1 && numero3 > numero2 -> return numero3
////        else -> return 0
////    }
////}
//
//class Trabalhador(val idade: Int, val sexo: Char, val anos: Int) {
//    fun verificarContribuicao() {
//        if (anos < 30){
//        println(false)
//    } else if(sexo == 'F' && idade > 59) {
//        println(true)
//    }else if(sexo =='M' && idade > 64){
//        println(true)
//    } else {
//        println(false)
//    }
//    }
//}
fun main () {
    val elon = Cliente("Elon", "Musk")
    val bill = Cliente("Bill", "Gates")
    val conta1 = Conta(123, 20.03, elon)
    val conta2 = Conta(234, 10.50, bill)
    conta1.deposito(5.00)
    conta2.saque(9.00)
}
class Cliente(
    val nome: String,
    val sobrenome: String
) {
}
class Conta(
    val numeroDaConta: Int,
    var saldo: Double,
    val titular: Cliente
) {
    fun deposito(valorDeposito: Double) {
        saldo += valorDeposito
        println("Depósito realizado com sucesso. Seu novo saldo é $saldo.")
    }
    fun saque(valorSaque: Double) {
        if( saldo < valorSaque){
            println("Saldo insuficiente.")
        }else {
            saldo -= valorSaque
            println("Saque realizado com sucesso. Seu novo saldo é $saldo.")
        }
    }
}

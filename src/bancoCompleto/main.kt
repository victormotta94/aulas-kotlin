package bancoCompleto

fun main() {
    val victorCorrente = ContaCorrente(1, 0.0, 5.0)
    val raphaPoupanca = ContaPoupanca(2, 0.0, 500.0)

    victorCorrente.depositar(1000.0)
    raphaPoupanca.depositar(1000.0)

    victorCorrente.sacar(800.00)
    raphaPoupanca.sacar(1200.00)

    val relatorio = Relatorio()
    relatorio.gerarRelatorio(victorCorrente)
    relatorio.gerarRelatorio(raphaPoupanca)

    victorCorrente.transferir(50.00, raphaPoupanca)

    relatorio.gerarRelatorio(victorCorrente)
    relatorio.gerarRelatorio(raphaPoupanca)

    var itau = Banco()
    itau.inserir(victorCorrente)
    itau.inserir(raphaPoupanca)

    itau.procurarConta(2)

    itau.mostrarDados()



}

abstract class ContaBancaria {

    abstract var numeroConta: Int
    abstract var saldo: Double
    abstract fun sacar(value: Double)

    abstract fun depositar(value: Double)

    fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        sacar(valor)
        contaBancaria.depositar(valor)
        println("Você transferiu $valor para a conta ${contaBancaria.numeroConta}")
    }

}

class ContaCorrente(
    override var numeroConta: Int = 0,
    override var saldo: Double = 0.0,
    val taxaDeOperacao: Double
) : ContaBancaria(), Imprimivel {

    override fun sacar(value: Double) {
        if (value > (saldo - taxaDeOperacao)) {
            println("Saldo insuficiente")
        } else {
            saldo -= (value + taxaDeOperacao)
            println("Saque executado com sucesso")
        }
    }

    override fun depositar(value: Double) {
        saldo += (value - taxaDeOperacao)
        println("Depósito realizado com sucesso")
    }

    override fun mostrarDados() {
        println(
            "O número da conta é $numeroConta," +
                    " o meu saldo é $saldo e a minha" +
                    " taxa de operação é $taxaDeOperacao"
        )
    }
}

class ContaPoupanca(
    override var numeroConta: Int = 0,
    override var saldo: Double = 0.0,
    val limite: Double
) : ContaBancaria(), Imprimivel {

    override fun sacar(value: Double) {
        val saldoTotal = saldo + limite
        if (value > saldoTotal) {
            println("Saldo insuficiente")
        } else {
            saldo -= value
            when {
                saldo < 0.0 -> println(
                    "Saque efetuado com sucesso. " +
                            "Você utilizou seu limite de crédito. Seu novo saldo é $saldo"
                )
                else -> println("Seu novo saldo é $saldo")
            }
        }
    }

    override fun depositar(value: Double) {
        saldo += value
        println("Depósito realizado com sucesso")
    }

    override fun mostrarDados() {
        println(
            "O número da conta é $numeroConta," +
                    " o meu saldo é $saldo e o meu" +
                    " limite é $limite e o saldo total é ${saldo + limite}"
        )
    }
}

interface Imprimivel {

    fun mostrarDados()
}

class Relatorio {

    fun gerarRelatorio(imprimivel: Imprimivel) {
        imprimivel.mostrarDados()
    }
}
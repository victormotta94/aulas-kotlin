package bancoCompleto

class Banco: Imprimivel {
    var listaContas = mutableListOf<ContaBancaria>()

    fun inserir(contaBancaria: ContaBancaria) {
        listaContas.add(contaBancaria)
//        for (i in listaContas) {
//            if (i !== listaContas) {
//                listaContas.add(i)
//                break
//            }
//        }
    }

    fun remover(contaBancaria: ContaBancaria) {
        for (i in listaContas) {
            if (i == listaContas) {
                listaContas.remove(i)
                break
            }
        }
    }

    fun procurarConta(numeroConta: Int): ContaBancaria? {
        for (i in listaContas) {
            if (i.numeroConta == numeroConta)
                return i
            println("O número da conta é ${i.numeroConta}")
        }
        return null

    }

    override fun mostrarDados() {
       listaContas.forEach { conta ->
           println(conta.numeroConta)
       }
    }
}

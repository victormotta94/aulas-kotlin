fun main() {
   println(maiorNumero(2, 3, 8))
}
 fun maiorNumero(numero1: Int, numero2: Int, numero3: Int): Int {
    when {
        numero1 > numero2 && numero1 > numero3 -> return numero1
        numero2 > numero1 && numero2 > numero3 -> return numero2
        numero3 > numero1 && numero3 > numero2 -> return numero3
    else -> return 0
    }
}
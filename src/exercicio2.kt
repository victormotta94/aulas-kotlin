fun main(){
    var jogador1 = JogadorDeFutebol("Neymar", 7, 40, 100, 2)
    var jogador2 = JogadorDeFutebol("Ronaldo", 100, 90, 200, 100)
    SessaoDeTreinamento(jogador1.experiencia).treinarA(jogador1)
    SessaoDeTreinamento(jogador2.experiencia).treinarA(jogador2)
}
class JogadorDeFutebol(
    val nome: String,
    var energia: Int,
    var alegria: Int,
    var gols: Int,
    var experiencia: Int
){
    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL!")
    }
    fun correr(){
        energia -= 10
        println("Cansei")
    }
}
class SessaoDeTreinamento(
    var experiencia: Int
){
    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        var xpAnterior: Int = experiencia
        experiencia ++
        println("Experiencia inicial: $xpAnterior. Experiencia final: $experiencia")
    }
}
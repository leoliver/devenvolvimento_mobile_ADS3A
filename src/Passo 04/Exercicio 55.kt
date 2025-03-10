//• [DESAFIO] Vamos melhorar o jogo que fizemos no exercício
//32. A partir de agora, o computador vai sortear um número entre
//1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

import kotlin.random.Random

fun main() {
    val Sorteado = Random.nextInt(1, 11)
    var tentativas = 4

    while (tentativas > 0) {
        print("Digite um número entre 1 e 10: ")
        val palpite = readLine()!!.toInt()

        if (palpite == Sorteado) {
            println("Parabéns! Você acertou.")
            return
        }

        tentativas--
        println("Errado! Tentativas restantes: $tentativas")
    }

    println("Acabaram as tentativas! O número era $Sorteado.")
}
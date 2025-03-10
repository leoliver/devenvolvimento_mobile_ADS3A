import kotlin.random.Random

//31 - [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura).
fun main() {
    // Opções do jogo
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    // Exibindo as opções para o jogador
    println("Escolha uma opção:")
    println("1 - Pedra")
    println("2 - Papel")
    println("3 - Tesoura")

    // Lendo a escolha do jogador
    val escolhaJogador = readLine()?.toIntOrNull()

    // Verificando se a escolha é válida
    if (escolhaJogador == null || escolhaJogador !in 1..3) {
        println("Escolha inválida. Digite um número de 1 a 3.")
        return
    }

    // Obtendo a escolha do jogador (como string)
    val escolhaJogadorString = opcoes[escolhaJogador - 1]

    // A escolha do computador é aleatória
    val escolhaComputador = opcoes[Random.nextInt(0, 3)]

    // Exibindo as escolhas
    println("Você escolheu: $escolhaJogadorString")
    println("O computador escolheu: $escolhaComputador")

    // Determinando o vencedor
    when {
        escolhaJogadorString == escolhaComputador -> println("Empate!")
        (escolhaJogadorString == "Pedra" && escolhaComputador == "Tesoura") ||
                (escolhaJogadorString == "Papel" && escolhaComputador == "Pedra") ||
                (escolhaJogadorString == "Tesoura" && escolhaComputador == "Papel") -> println("Você venceu!")
        else -> println("O computador venceu!")
    }
}
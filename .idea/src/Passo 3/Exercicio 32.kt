import kotlin.random.Random

//32 - [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5, e o jogador vai tentar descobrir qual foi o valor sorteado.
fun main() {
    // Sorteando um número entre 1 e 5
    val numeroSorteado = Random.nextInt(1, 6)

    // Pedindo para o jogador tentar adivinhar o número
    println("Tente adivinhar o número sorteado entre 1 e 5:")

    // Lendo a tentativa do jogador
    val tentativa = readLine()?.toIntOrNull()

    // Verificando se a tentativa é válida
    if (tentativa == null || tentativa !in 1..5) {
        println("Por favor, digite um número entre 1 e 5.")
        return
    }

    // Comparando a tentativa do jogador com o número sorteado
    if (tentativa == numeroSorteado) {
        println("Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
    } else {
        println("Você errou. O número sorteado foi $numeroSorteado. Tente novamente!")
    }
}
package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 30
    val vetor = IntArray(tamanhoVetor)


    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(1, 16)
    }

    print("Digite um número (chave): ")
    val chave = readLine()!!.toInt()

    var contadorChave = 0
    println("\nPosições onde a chave $chave foi encontrada:")
    for (i in 0 until tamanhoVetor) {
        if (vetor[i] == chave) {
            println("Posição ${i + 1}")
            contadorChave++
        }
    }

    println("\nA chave $chave foi sorteada $contadorChave vezes.")
}
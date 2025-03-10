package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 20
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println("Números gerados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()

    vetor.sort()

    println("\nNúmeros ordenados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()
}
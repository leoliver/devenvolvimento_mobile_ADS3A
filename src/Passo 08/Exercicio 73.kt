package Passo_8

fun main() {
    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = 9 - i
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}
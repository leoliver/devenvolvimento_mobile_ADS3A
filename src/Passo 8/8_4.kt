package Passo_8

fun main() {
    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        if (i % 2 == 0) {
            vetor[i] = 5
        } else {
            vetor[i] = 3
        }
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}
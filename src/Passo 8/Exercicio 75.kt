package Passo_8

fun main() {
    val tamanhoVetor = 15
    val vetor = IntArray(tamanhoVetor)
    
    vetor[0] = 1
    vetor[1] = 1
    for (i in 2 until tamanhoVetor) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}
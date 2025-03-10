package Passo_8

fun main() {
    val tamanhoVetor = 10
    val numeros = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("\nNúmeros pares e suas posições:")
    for (i in 0 until tamanhoVetor) {
        if (numeros[i] % 2 == 0) {
            println("Número ${numeros[i]} na posição ${i + 1}")
        }
    }
}
package Passo_8

fun main() {
    val tamanhoVetor = 15
    val numeros = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("\nVetor completo:")
    for (numero in numeros) {
        print("$numero ")
    }
    println()

    println("\nPosições dos múltiplos de 10:")
    for (i in 0 until tamanhoVetor) {
        if (numeros[i] % 10 == 0) {
            println("Posição ${i + 1}: ${numeros[i]}")
        }
    }
}
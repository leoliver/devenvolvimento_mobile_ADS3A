package Passo_8

fun main() {
    val tamanhoVetor = 7
    val nomes = Array(tamanhoVetor) { "" }

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        nomes[i] = readLine()!!
    }
    
    println("\nNomes na ordem inversa:")
    for (i in tamanhoVetor - 1 downTo 0) {
        println(nomes[i])
    }
}
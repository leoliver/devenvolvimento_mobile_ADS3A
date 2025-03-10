package Passo_8

fun main() {
    val tamanhoVetor = 9
    val nomes = Array(tamanhoVetor) { "" }
    val idades = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        nomes[i] = readLine()!!

        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}
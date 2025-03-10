package Passo_8

fun main() {
    val tamanhoVetor = 8
    val idades = IntArray(tamanhoVetor)


    var somaIdades = 0
    for (i in 0 until tamanhoVetor) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]
    }

    val mediaIdade = somaIdades.toDouble() / tamanhoVetor

    var maiorIdade = idades[0]
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("\nMédia de idade: $mediaIdade")

    println("\nPosições com pessoas com mais de 25 anos:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}: ${idades[i]} anos")
        }
    }

    println("\nMaior idade digitada: $maiorIdade")

    println("\nPosições da maior idade:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] == maiorIdade) {
            println("Posição ${i + 1}")
        }
    }
}
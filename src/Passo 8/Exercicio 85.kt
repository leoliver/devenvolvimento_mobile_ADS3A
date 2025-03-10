package Passo_8

fun main() {
    val tamanhoVetor = 5
    val nomes = Array(tamanhoVetor) { "" }
    val sexos = Array(tamanhoVetor) { "" }
    val salarios = DoubleArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome do ${i + 1}º funcionário: ")
        nomes[i] = readLine()!!

        print("Digite o sexo do ${i + 1}º funcionário (M/F): ")
        sexos[i] = readLine()!!

        print("Digite o salário do ${i + 1}º funcionário: ")
        salarios[i] = readLine()!!.toDouble()
    }

    println("\nFuncionárias mulheres que ganham mais de R$5 mil:")
    for (i in 0 until tamanhoVetor) {
        if (sexos[i] == "F" && salarios[i] > 5000.0) {
            println("Nome: ${nomes[i]}, Salário: R$${salarios[i]}")
        }
    }
}
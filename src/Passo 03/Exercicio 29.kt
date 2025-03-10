//29 - Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir:
//Até 3 anos de empresa → aumento de 3%
//Entre 3 e 10 anos → aumento de 12.5%
//10 anos ou mais → aumento de 20%
fun main() {
    // Leitura do nome do funcionário
    println("Digite o nome do funcionário:")
    val nome = readLine()!!

    // Leitura do salário do funcionário
    println("Digite o salário do funcionário (em R$):")
    val salario = readLine()!!.toDouble()

    // Leitura dos anos de trabalho na empresa
    println("Digite quantos anos o funcionário trabalha na empresa:")
    val anosTrabalho = readLine()!!.toInt()

    // Cálculo do novo salário com base nos anos de trabalho
    val novoSalario = when {
        anosTrabalho <= 3 -> salario * 1.03  // Aumento de 3%
        anosTrabalho in 4..10 -> salario * 1.125  // Aumento de 12.5%
        anosTrabalho > 10 -> salario * 1.20  // Aumento de 20%
        else -> salario
    }

    // Exibindo o novo salário
    println("Funcionário: $nome")
    println("Salário atual: R$ %.2f".format(salario))
    println("Novo salário: R$ %.2f".format(novoSalario))
}
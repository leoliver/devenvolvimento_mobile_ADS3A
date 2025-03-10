// 33 - Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
//O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
//Calcule o valor da prestação mensal.
//A prestação não pode exceder 30% do salário, ou o empréstimo será negado.
fun main() {
    // Solicita o valor da casa, salário do comprador e o número de anos para pagar
    println("Digite o valor da casa (R$):")
    val valorCasa = readLine()!!.toDouble()

    println("Digite o salário do comprador (R$):")
    val salario = readLine()!!.toDouble()

    println("Digite em quantos anos o comprador vai pagar a casa:")
    val anos = readLine()!!.toInt()

    // Cálculo do número de parcelas mensais
    val numeroParcelas = anos * 12

    // Cálculo da prestação mensal
    val prestacaoMensal = valorCasa / numeroParcelas

    // Verifica se a prestação mensal excede 30% do salário
    val limitePrestacao = salario * 0.30

    // Exibe o resultado
    if (prestacaoMensal <= limitePrestacao) {
        println("Empréstimo aprovado!")
        println("Valor da prestação mensal: R$ %.2f".format(prestacaoMensal))
    } else {
        println("Empréstimo negado!")
        println("A prestação mensal de R$ %.2f excede o limite de 30% do seu salário.".format(prestacaoMensal))
    }
}
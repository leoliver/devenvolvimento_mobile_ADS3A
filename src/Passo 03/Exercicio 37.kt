//37 - Uma empresa precisa reajustar o salário dos funcionários conforme gênero e tempo de empresa:
//
//Mulheres:
//Menos de 15 anos → +5%
//De 15 até 20 anos → +12%
//Mais de 20 anos → +23%
//Homens:
//Menos de 20 anos → +3%
//De 20 até 30 anos → +13%
//Mais de 30 anos → +25%
fun main() {
    // Solicita o gênero do funcionário
    println("Digite o gênero do funcionário (M para Masculino ou F para Feminino):")
    val genero = readLine()?.uppercase()

    if (genero != "M" && genero != "F") {
        println("Gênero inválido. Digite 'M' para Masculino ou 'F' para Feminino.")
        return
    }

    // Solicita o tempo de empresa e o salário atual
    println("Digite o tempo de empresa em anos:")
    val tempoDeEmpresa = readLine()!!.toInt()

    println("Digite o salário atual (R$):")
    val salarioAtual = readLine()!!.toDouble()

    // Variável para armazenar o percentual de reajuste
    var percentualReajuste = 0.0

    if (genero == "F") {
        // Reajuste para mulheres
        percentualReajuste = when {
            tempoDeEmpresa < 15 -> 5.0
            tempoDeEmpresa in 15..20 -> 12.0
            else -> { 23.0 }
        }
    } else if (genero == "M") {
        // Reajuste para homens
        percentualReajuste = when {
            tempoDeEmpresa < 20 -> 3.0
            tempoDeEmpresa in 20..30 -> 13.0
            else -> {25.0}
        }
    }

    // Calcula o valor do reajuste
    val reajuste = salarioAtual * (percentualReajuste / 100)
    val salarioReajustado = salarioAtual + reajuste

    // Exibe o resultado
    println("Percentual de reajuste: $percentualReajuste%")
    println("Valor do reajuste: R$ %.2f".format(reajuste))
    println("Salário reajustado: R$ %.2f".format(salarioReajustado))
}

//36 - Um programa de vida saudável quer dar pontos por atividades físicas. O sistema funciona assim:
//Até 10h de atividade no mês → 2 pontos por hora
//De 10h até 20h → 5 pontos por hora
//Acima de 20h → 10 pontos por hora
//Cada ponto vale R$0,05

fun main() {
    // Solicita o número de horas de atividade no mês
    println("Digite o número de horas de atividade física no mês:")
    val horasAtividade = readLine()!!.toInt()

    // Variável para armazenar os pontos
    var pontos = 0

    // Calcula os pontos com base nas horas de atividade
    when {
        horasAtividade <= 10 -> pontos = horasAtividade * 2
        horasAtividade in 11..20 -> pontos = horasAtividade * 5
        horasAtividade > 20 -> pontos = horasAtividade * 10
    }

    // Calcula o valor em reais
    val valorEmReais = pontos * 0.05

    // Exibe os pontos e o valor
    println("Você acumulou $pontos pontos.")
    println("O valor correspondente é R$ %.2f".format(valorEmReais))
}
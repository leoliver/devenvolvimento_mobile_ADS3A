// 35 - Uma empresa de aluguel de carros cobra preços diferenciados para carros populares e de luxo.
//Carros populares (R$90/dia):
//Até 100Km percorridos → R$0,20 por Km
//Acima de 100Km percorridos → R$0,10 por Km
//Carros de luxo (R$150/dia):
//Até 200Km percorridos → R$0,30 por Km
//Acima de 200Km percorridos → R$0,25 por Km
fun main() {
    // Solicita o tipo de carro escolhido (popular ou luxo)
    println("Escolha o tipo de carro:")
    println("1 - Carro Popular")
    println("2 - Carro de Luxo")
    val tipoCarro = readLine()?.toIntOrNull()

    if (tipoCarro == null || tipoCarro !in 1..2) {
        println("Opção inválida. Digite 1 para Carro Popular ou 2 para Carro de Luxo.")
        return
    }

    // Solicita o número de dias de aluguel e a quantidade de km percorridos
    println("Digite o número de dias de aluguel:")
    val dias = readLine()!!.toInt()

    println("Digite a quantidade de km percorridos:")
    val kmPercorridos = readLine()!!.toInt()

    // Variáveis para armazenar o preço diário e o valor total
    var precoDiario = 0.0
    var custoKm = 0.0

    if (tipoCarro == 1) {
        // Carro popular
        precoDiario = 90.0
        custoKm = if (kmPercorridos <= 100) {
            kmPercorridos * 0.20
        } else {
            (100 * 0.20) + ((kmPercorridos - 100) * 0.10)
        }
    } else if (tipoCarro == 2) {
        // Carro de luxo
        precoDiario = 150.0
        custoKm = if (kmPercorridos <= 200) {
            kmPercorridos * 0.30
        } else {
            (200 * 0.30) + ((kmPercorridos - 200) * 0.25)
        }
    }

    // Cálculo do valor total do aluguel
    val valorTotal = (precoDiario * dias) + custoKm

    // Exibe o valor total
    println("O valor total do aluguel será: R$ %.2f".format(valorTotal))
}
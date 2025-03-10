//Escreva um programa que pergunte a velocidade de um carro.
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
//cada Km acima da velocidade permitida.



fun main() {
    print("Digite a velocidade do carro (Km/h): ")
    val velocidade = readLine()?.toIntOrNull() ?: 0
    val limiteVelocidade = 80
    val valorMultaPorKm = 5

    if (velocidade > limiteVelocidade) {
        val excesso = velocidade - limiteVelocidade
        val multa = excesso * valorMultaPorKm
        println("Você foi multado! Excedeu o limite de $limiteVelocidade Km/h.")
        println("Valor da multa: R$$multa,00")
    } else {
        println("Velocidade dentro do limite permitido. Dirija com segurança!")
    }
}

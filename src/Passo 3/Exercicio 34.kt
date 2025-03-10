// 34 - Calcule o Índice de Massa Corpórea (IMC) de uma pessoa e classifique conforme a tabela:
//Abaixo de 18.5 → Abaixo do peso
//Entre 18.5 e 25 → Peso ideal
//Entre 25 e 30 → Sobrepeso
//Entre 30 e 40 → Obesidade
//Acima de 40 → Obesidade mórbida
fun main() {
    // Solicita o peso e a altura da pessoa
    println("Digite o seu peso (kg):")
    val peso = readLine()!!.toDouble()

    println("Digite a sua altura (m):")
    val altura = readLine()!!.toDouble()

    // Cálculo do IMC
    val imc = peso / (altura * altura)

    // Exibe o valor do IMC
    println("Seu IMC é: %.2f".format(imc))

    // Classificação do IMC
    when {
        imc < 18.5 -> println("Classificação: Abaixo do peso")
        imc in 18.5..24.9 -> println("Classificação: Peso ideal")
        imc in 25.0..29.9 -> println("Classificação: Sobrepeso")
        imc in 30.0..39.9 -> println("Classificação: Obesidade")
        imc >= 40 -> println("Classificação: Obesidade mórbida")
    }
}
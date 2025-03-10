//28 - Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m².
//
//O programa também deve mostrar a classificação do terreno:
//Abaixo de 100m² → TERRENO POPULAR
//Entre 100m² e 500m² → TERRENO MASTER
//Acima de 500m² → TERRENO VIP
fun main() {
    // Leitura da largura e comprimento do terreno
    println("Digite a largura do terreno (em metros):")
    val largura = readLine()!!.toDouble()

    println("Digite o comprimento do terreno (em metros):")
    val comprimento = readLine()!!.toDouble()

    // Cálculo da área do terreno
    val area = largura * comprimento

    // Exibindo a área
    println("A área do terreno é: %.2f m²".format(area))

    // Classificação do terreno
    when {
        area < 100 -> println("Classificação: TERRENO POPULAR")
        area in 100.0..500.0 -> println("Classificação: TERRENO MASTER")
        area > 500 -> println("Classificação: TERRENO VIP")
    }
}
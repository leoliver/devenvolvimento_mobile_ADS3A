//24 - Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km.
//Calcule o preço da passagem, cobrando R$0,50 por Km para viagens até 200Km e R$0,45 para viagens mais longas.
fun main() {
    print("Digite a distância a ser percorrida (Km): ")
    val distancia = readln().toDouble()

    val preco = if (distancia <= 200) {
        distancia * 0.50
    } else {
        distancia * 0.45
    }

    println("O preço da passagem é: R$$preco")
}

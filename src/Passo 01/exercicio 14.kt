//15 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
//programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
//e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

fun main() {
    print("Modelo do Carro: ")
    val modelo = readln()
    print("KM do Carro: ");
    val km = readln().toInt()
    print("Quantidade de Dias: ");
    val dias = readln().toInt()
    val preco_diaria = 90.00 * dias
    val preco_km = 0.20 * km
    val preco_total = preco_diaria + preco_km
    println("O valor total do aluguel sera: $preco_total ")

}
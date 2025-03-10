//23 - Uma loja quer dar descontos para todos, mas especialmente para mulheres.
//Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.
//Homens ganham 5% de desconto.
//Mulheres ganham 13% de desconto.
fun main() {
    print("Digite o nome do cliente: ")
    val nome = readln()

    print("Digite o sexo do cliente (M/F): ")
    val sexo = readln().uppercase()

    print("Digite o valor das compras: ")
    val valorCompras = readln().toDouble()

    val desconto = if (sexo == "F") 0.13 else 0.05
    val valorFinal = valorCompras * (1 - desconto)

    println("O valor final com desconto é: R$$valorFinal")
}

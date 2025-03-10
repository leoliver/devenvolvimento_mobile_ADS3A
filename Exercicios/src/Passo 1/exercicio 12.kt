//13 Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
//seu PREÇO PROMOCIONAL, com 5% de desconto.

fun main() {
    print("Qual o produto: ");
    val produto = readln();
    print("Digite o valor do produto: ");
    val valor = readln().toDouble();
    val desconto = valor * 0.95;
    println("O $produto no valor total de: $valor R$ recebeu um desconto de 5% e ficara: $desconto R$ Com o desconto aplicado")
}
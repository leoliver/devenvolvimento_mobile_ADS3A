//10 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
//R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
//cotação atual)

fun main() {
    print("Quantidade de Real: ")
    val real = readln().toDouble();
    val dolar = real * 3.45

    println("$real é equivalente a $dolar")

}
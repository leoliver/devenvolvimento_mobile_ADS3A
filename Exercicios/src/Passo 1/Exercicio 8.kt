//9 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
//valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 100
//Distância de 10000 Cm

fun main() {
    print("Digite um numero: ")
    val metros = readln().toDouble();
    val cm = metros * 100

    println("$metros é equivalente a $cm")

}
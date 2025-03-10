//4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun main() {
    print("Digite um numero: ")
    val number1 = readln().toDouble();
    print("Digite um numero: ")
    val number2 = readln().toDouble();
    val soma = number1 + number2;
    println("Ola sua soma é $soma")
}
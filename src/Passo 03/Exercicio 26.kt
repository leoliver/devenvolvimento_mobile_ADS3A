//26 - Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
//O primeiro valor é o maior
//O segundo valor é o maior
//Não existe valor maior, os dois são iguais
fun main() {
    println("Numero 1: ")
    val num1 = readln().toInt()

    println("Numero 2: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        return println("O primeiro valor é o maior")
    }
    if(num2 > num1) {
        return println("O segundo valor é o maior")
    }
    return println("não existe valor maior, os dois são iguais")
}
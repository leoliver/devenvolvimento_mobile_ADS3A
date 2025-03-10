/*Faça um programa que mostre os 10 primeiros elementos
da Sequência de Fibonacci*/

fun FibonacciList() {
    var primeiro = 1
    var segundo = 1

    print("Sequência de Fibonacci: ")
    print("$primeiro $segundo")

    for (i in 3..10) {
        val proximo = primeiro + segundo
        print(" $proximo")
        primeiro = segundo
        segundo = proximo
    }
    println()
}

fun main() {
    FibonacciList()
}
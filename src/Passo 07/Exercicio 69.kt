/*Desenvolva um programa que leia o primeiro termo e a
razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da
sequência.*/

fun ProgressaoAritmetica(primeiroTermo: Int, razao: Int) {
    var termo = primeiroTermo
    var soma = 0

    print("PA: ")
    for (i in 1..10) {
        print("$termo >> ")
        soma += termo
        termo += razao
    }
    print("FIM")
    println("\nSoma dos termos: $soma")
}

fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    ProgressaoAritmetica(primeiroTermo, razao)
}
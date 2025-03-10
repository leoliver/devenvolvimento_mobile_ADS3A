//• Faça um programa que possua uma função chamada Potencia(),
//que vai receber dois parâmetros numéricos (base e expoente) e vai
//calcular o resultado da exponenciação.
//Ex: Potencia(5,2) vai calcular 5**2 = 25

fun potencia(base: Int, expoente: Int): Int {
    var resultado = 1
    for (i in 1..expoente) {
        resultado *= base
    }
    return resultado
}

fun main() {
    print("Digite um numero inteiro que voce quer como Base: ")
    var base = readln()!!.toInt()
    print("Digite um numero inteiro que voce quer como expoente: ")
    var expoente = readln()!!.toInt()
    var resultado = potencia(base , expoente)
    print("o resultado da exponenciação é: $resultado")
}
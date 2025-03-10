//• Refaça o exercício 90, só que agora em forma de função
//Somador(), que vai receber dois parâmetros e vai retornar o
//resultado da soma entre eles para o programa principal.

fun Somador(a: Int , b: Int): Int {
    return a + b
}

fun main () {
    print("Digite um numero inteiro: ")
    var numero1 =  readln()!!.toInt()
    print("Digite o segundo numero inteiro: ")
    var numero2 = readln()!!.toInt()

    var resultado = Somador(numero1 ,numero2)
    print("o seu resultador é $resultado")
}
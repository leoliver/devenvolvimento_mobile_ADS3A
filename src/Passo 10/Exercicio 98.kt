//• Crie um programa que tenha uma função SuperSomador(), que vai
//receber dois números como parâmetro e depois vai retornar a soma
//de todos os valores no intervalo entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar
//85

fun SuperSomador(a:Int , b:Int):Int{
    val maior = maxOf(a , b)
    val menor = minOf(a, b)

    var soma = 0
    for (num in menor..maior){
        soma += num
    }
    return soma
}

fun main() {
    print("Coloca um numero: ")
    var n1 = readln()!!.toInt()
    print("Coloca outro numero: ")
    var n2 = readln()!!.toInt()
    var resultado = SuperSomador(n1 , n2)
    print("a soma dos intervalos entre os valores de $n1 a $n2 é: $resultado")
}

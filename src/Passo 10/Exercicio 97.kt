//• Refaça o exercício 91, só que agora em forma de função Maior(),
//mas faça uma adaptação que vai receber TRÊS números como parâmetro
//e vai retornar qual foi o maior entre eles.

fun Maior(a:Int , b:Int , c:Int):Int {
    return maxOf(a , b , c)
}

fun main() {
    print("Digite um valor inteiro: ")
    var n1 = readln()!!.toInt()
    print("Digite um segundo valor: ")
    var n2 = readln()!!.toInt()
    print("Digite um terceiro valor: ")
    var n3 = readln()!!.toInt()
    var resultado = Maior(n1 , n2 , n3)
    print("o maior numero que apareceu é $resultado")
}
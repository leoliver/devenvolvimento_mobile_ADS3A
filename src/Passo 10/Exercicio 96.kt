//• Crie um programa que tenha uma função Media(), que vai receber
//as 2 notas de um aluno e retornar a sua média para o programa
//principal.

fun Media(n1: Int , n2: Int): Int {
    return (n1 + n2) / 2
}

fun main() {
    print("Digite sua nota: ")
    var notaap1 = readln()!!.toInt()
    print("Digite sua segunda nota: ")
    var notaap2 = readln()!!.toInt()
    var soma = Media(notaap1 , notaap2)
    print("A sua media é: $soma")
}
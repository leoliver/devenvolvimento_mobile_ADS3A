//• Melhore o exercício 96, criando além da função Media() uma
//outra função chamada Situacao(), que vai retornar para o programa
//principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
//Essa nova função, vai receber como parâmetro o resultado
//retornado pela função Media().

fun Media2 (n1: Int , n2: Int): Int {
    return (n1 + n2) / 2
}

fun Situação(resultado: Int):String {

    if(resultado >=6){
        return "APROVADO"
    }else if(resultado ==5) {
        return "FAZER PROVA SUBSTITUTIVA "
    }else{
        return "REPROVADO"
    }
}


fun main() {
    print("Digite sua nota: ")
    var nota1 = readln()!!.toInt()
    print("Digite sua segunda nota: ")
    var nota2 = readln()!!.toInt()
    var soma = Media2(nota1 , nota2)
    var resultado = Situação(soma)
    println("A sua media é: $soma")
    println("Resultado: $resultado")
    }

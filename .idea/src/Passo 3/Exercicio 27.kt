//27 - Crie um programa que leia duas notas de um aluno e calcule
//a sua média, mostrando uma mensagem no final, de acordo com a
//média atingida:
//• Média até 4.9: REPROVADO
//• Média entre 5.0 e 6.9: RECUPERAÇÃO
//• Média 7.0 ou superior: APROVADO
fun main() {
    println("Nota 1: ")
    val nota1 = readln().toDouble()

    println("Nota 2: ")
    val nota2 = readln().toDouble()

    val media = nota1 + nota2 / 2

    if (media <= 4.9) { return println("REPROVADO")}
    if (media <= 6.9 ) { return println("RECUPERAÇÃO")}
    return println("APROVADO")
}
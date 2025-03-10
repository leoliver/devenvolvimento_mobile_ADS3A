//22 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
//Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
//Se já tiver mais de 18 anos, mostre quantos anos já se passaram do alistamento.
fun main() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val idade = 2023 - anoNascimento

    if (idade < 18) {
        println("Faltam ${18 - idade} anos para o alistamento.")
    } else {
        println("Já se passaram ${idade - 18} anos do alistamento.")
    }
}
//3 Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
//mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.

fun main() {
    println("Digite seu nome")
    val name = readln()
    println("Digite seu salario")
    val salario = readln()
    println("Ola $name Seu Salario é $salario")
}
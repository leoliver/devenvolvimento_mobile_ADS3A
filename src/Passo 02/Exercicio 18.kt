//• Faça um programa que leia o ano de nascimento de uma pessoa,
//calcule a idade dela e depois mostre se ela pode ou não votar.

import java.time.LocalDate
import java.time.Period

fun calcularIdade(dataNascimento: LocalDate): Int {
    val dataAtual = LocalDate.now()
    val periodo = Period.between(dataNascimento, dataAtual)
    return periodo.years
}

fun main() {
    print("Digite seu ano de nascimento: ")
    val ano = readln().toInt()
    print("Digite seu mes de nascimento: ")
    val mes = readln().toInt()
    print("Digite seu dia de nascimento: ")
    val dia = readln().toInt()

    val dataNascimento = LocalDate.of(ano, mes, dia)
    val idade = calcularIdade(dataNascimento)
    println("A idade é: $idade anos")

    if (idade >= 18) {
        println("Você esta elegivel a poder votar")
    }
    else {
        val aguarde = 18 - idade
        println("Aguarde: $aguarde anos ate poder votar")
    }
}
//• Faça um programa que leia a idade e o sexo de 5 pessoas,
//mostrando no final:
//• Quantos homens foram cadastrados
//• Quantas mulheres foram cadastradas
//• A média de idade do grupo
//• A média de idade dos homens
//• Quantas mulheres tem mais de 20 anos

fun main() {
    var Homen = 0
    var Mulher= 0
    var somaIdades = 0
    var somaIdadeHomens = 0
    var qtdMulheresMais20 = 0
    var qtd = 0

    while (qtd < 5) {
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!

        somaIdades += idade

        if (sexo == "M" || sexo == "m") {
            Homen++
            somaIdadeHomens += idade
        } else if (sexo == "F" || sexo == "f") {
            Mulher++
            if (idade > 20) {
                qtdMulheresMais20++
            }
        }
        qtd++
    }
    val mediaIdadeGrupo = somaIdades / 5.0
    val mediaIdadeHomens = if (Homen > 0) somaIdadeHomens / Homen.toDouble() else 0.0

    println("Total de homens cadastrados: $Homen")
    println("Total de mulheres cadastradas: $Mulher")
    println("Média de idade do grupo: %.2f".format(mediaIdadeGrupo))
    println("Média de idade dos homens: %.2f".format(mediaIdadeHomens))
    println("Mulheres com mais de 20 anos: $qtdMulheresMais20")
}
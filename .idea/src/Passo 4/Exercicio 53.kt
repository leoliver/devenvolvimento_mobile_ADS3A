//• Crie um algoritmo que leia a idade de 10 pessoas, mostrando no
//final:
//• Qual é a média de idade do grupo
//• Quantas pessoas tem mais de 18 anos
//• Quantas pessoas tem menos de 5 anos
//• Qual foi a maior idade lida

fun main(){
    var mais18 = 0
    var menos5 = 0
    var somaIdade = 0
    var maiorDeIdade = 0
    var qtd = 0

    while(qtd <= 10){
        print("Digite sua idade: ")
        val idade = readln()!!.toInt()
        somaIdade  += idade

        if(idade >= 18){
            mais18 ++
        }

        if(idade < 5){
            menos5 ++
        }

        if(idade > maiorDeIdade){
            maiorDeIdade = idade
        }
        qtd++
    }
    val media = somaIdade.toDouble() / qtd
    println("Media de idade do grupo de pessoas: $media")
    println("Quantidade de pessoas com maior de 18 anos: $mais18")
    println("Quantidade de pessoas menores de 5 anos: $menos5")
    println("Maior idade citada: $maiorDeIdade")
}
//Faça um algoritmo que leia a idade de vários alunos de uma
//turma. O programa vai parar quando for digitada a idade 999. No
//final, mostre quantos alunos existem na turma e qual é a média de
//idade do grupo.
fun somaidade(): Int{
    var soma = 0
    var numAlu = 0
    var flag = true
    while (flag) {
        print("Digite a idade do aluno ${numAlu+1}:")
        var num = readln()!!.toInt()
        if(num != 999) {
            soma += num
            numAlu += 1
        } else{
            println("Operação encerrada!")
            flag = false
        }
    }
    var media = soma/numAlu
    return media
}
fun main(){
    print("Deseja fazer a média das idades dos seus alunos?")
    var resposta = readln()
    var respostatratada = resposta.lowercase()
    if (respostatratada == "sim") {
        var media = somaidade()
        println("A Média das idades é: $media")
    } else{
        println("OK")
    }
}
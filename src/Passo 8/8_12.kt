package Passo_8

fun main() {
    val tamanhoVetor = 10
    val notas = DoubleArray(tamanhoVetor)

    var somaNotas = 0.0
    for (i in 0 until tamanhoVetor) {
        print("Digite a nota do ${i + 1}º aluno: ")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]
    }

    val mediaTurma = somaNotas / tamanhoVetor

    var maiorNota = notas[0]
    for (nota in notas) {
        if (nota > maiorNota) {
            maiorNota = nota
        }
    }

    println("\nMédia da turma: $mediaTurma")

    var alunosAcimaMedia = 0
    println("\nAlunos acima da média:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] > mediaTurma) {
            println("Aluno ${i + 1}: Nota ${notas[i]}")
            alunosAcimaMedia++
        }
    }
    println("Total de alunos acima da média: $alunosAcimaMedia")

    println("\nMaior nota digitada: $maiorNota")

    println("\nPosições da maior nota:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] == maiorNota) {
            println("Posição ${i + 1}")
        }
    }
}
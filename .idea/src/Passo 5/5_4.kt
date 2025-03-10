fun main() {
    var maiorIdade = 0
    var totalHomens = 0
    var idadeMulherMaisJovem: Int? = null
    var somaIdadesHomens = 0
    var totalIdadesHomens = 0
    var flag = true

    while (flag) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        if (idade > maiorIdade) {
            maiorIdade = idade
        }

        if (sexo == "M") {
            totalHomens+=1
            somaIdadesHomens += idade
            totalIdadesHomens+=1
        } else if (sexo == "F") {
            if (idadeMulherMaisJovem == null) {
                idadeMulherMaisJovem = idade
            } else if (idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
            }
        }

        print("Deseja continuar? (S/N): ")
        val resposta = readLine()
        if (resposta == "S"){
            continue
        } else {
            flag = false
        }
    }

    println("\nMaior idade lida: $maiorIdade")
    println("Total de homens cadastrados: $totalHomens")
    if (idadeMulherMaisJovem != null) {
        println("Idade da mulher mais jovem: ${idadeMulherMaisJovem!!}")
    } else {
        println("Nenhuma mulher cadastrada.")
    }
    if (totalIdadesHomens > 0) {
        var mediaIdadeHomens = somaIdadesHomens.toDouble() / totalIdadesHomens
        println("Média de idade dos homens: $mediaIdadeHomens")
    } else {
        println("Nenhum homem cadastrado.")
    }
}
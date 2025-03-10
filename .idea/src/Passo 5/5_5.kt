fun main() {
    var nomePessoaMaisVelha = ""
    var idadePessoaMaisVelha = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem: Int? = null
    var somaIdades = 0
    var totalPessoas = 0
    var homensMais30 = 0
    var mulheresMenos18 = 0
    var flag = true

    while (flag) {
        print("Digite o nome: ")
        val nome = readLine()!!

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()

        if (idade > idadePessoaMaisVelha) {
            idadePessoaMaisVelha = idade
            nomePessoaMaisVelha = nome
        }

        // Mulher mais jovem
        if (sexo == "F") {
            if (idadeMulherMaisJovem == null) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            } else if (idade < idadeMulherMaisJovem!!) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }
        }

        somaIdades += idade
        totalPessoas++

        if (sexo == "M" && idade > 30) {
            homensMais30++
        }

        if (sexo == "F" && idade < 18) {
            mulheresMenos18++
        }

        print("Deseja continuar? (S/N): ")
        val resposta = readLine()!!.toUpperCase()
        if (resposta == "S"){
            continue
        } else {
            flag = false
        }
    }

    println("\nNome da pessoa mais velha: $nomePessoaMaisVelha")
    if (nomeMulherMaisJovem.isNotEmpty()) {
        println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    } else {
        println("Nenhuma mulher cadastrada.")
    }
    val mediaIdade = somaIdades.toDouble() / totalPessoas
    println("Média de idade do grupo: $mediaIdade")
    println("Homens com mais de 30 anos: $homensMais30")
    println("Mulheres com menos de 18 anos: $mulheresMenos18")
}
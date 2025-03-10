/*• Crie um programa usando a estrutura “faça enquanto” que leia
vários números. A cada laço, pergunte se o usuário quer continuar
ou não. No final, mostre na tela:
• O somatório entre todos os valores
• Qual foi o menor valor digitado
• A média entre todos os valores
• Quantos valores são pares*/

fun main() {
    var totalNumeros = 0
    var somaNumeros = 0
    var menor: Int? = null
    var pares = 0
    var continuar: String

    do {
        print("Digite uma numero: ")
        val numero = readln().toInt()

        somaNumeros += numero
        totalNumeros++


        if (numero % 2 == 0) {
            pares++
        }

        if (menor == null || numero < menor) {
            menor = numero
        }

        print("Deseja Continuar? S/N: ");
        continuar = readln().trim().lowercase()

    } while (continuar == "s")

    if (totalNumeros > 0) {
        val mediaIdades = somaNumeros.toDouble() / totalNumeros
        println("\nResultados")
        println("Total de somatoria do numeros digitadas: $somaNumeros")
        println("O menor valor digitado foi: $menor")
        println("Média dos numeros: %.2f".format(mediaIdades))
        println("quantidade de numeros pares digitado: $pares")
    } else {
        println("Nenhuma numero foi digitada")
    }

}

/*• • Faça um programa usando a estrutura “faça enquanto” que leia a
idade de várias pessoas. A cada laço, você deverá perguntar para o
usuário se ele quer ou não continuar a digitar dados. No final,
quando o usuário decidir parar, mostre na tela:
• Quantas idades foram digitadas
• Qual é a média entre as idades digitadas
• Quantas pessoas tem 21 anos ou mais.
 */

fun main(){
    var totalIdades = 0
    var somaIdades = 0
    var maiores21 = 0
    var continuar: String

    do {
        print("Digite uma idade: ")
        val idade = readln().toInt()

        somaIdades += idade
        totalIdades++

        if (idade >= 21){
            maiores21++
        }

        print("Deseja Continuar? S/N: ");
        continuar = readln().trim().lowercase()

    } while (continuar == "s")

    if (totalIdades > 0) {
        val mediaIdades = somaIdades.toDouble() / totalIdades
        println("\nResultados")
        println("Total de idades digitadas: $totalIdades")
        println("Média das idades: %.2f" .format(mediaIdades))
        println("Pessoas com 21 anos ou mais: $maiores21")
    } else{
        println("Nenhuma Idade foi digitada")
    }


}

/*• Crie um programa que leia sexo e peso de 8 pessoas,
usando a estrutura “para”. No final, mostre na tela:
• Quantas mulheres foram cadastradas
• Quantos homens pesam mais de 100Kg
• A média de peso entre as mulheres
• O maior peso entre os homens*/

fun main() {
    var mulheres = 0
    var homensAcima100kg = 0
    var somaPesoMulheres = 0.0
    var totalMulheres = 0
    var maiorPesoHomem = 0.0

    for (i in 1..8) {
        print("Pessoa $i - Digite o sexo (M/F): ")
        val sexo = readln().trim().uppercase()

        print("Pessoa $i - Digite o peso (kg): ")
        val peso = readln().toDoubleOrNull()

        if (peso == null || (sexo != "M" && sexo != "F")) {
            println("Entrada inválida. Tente novamente.")
            continue // Se houver entrada inválida, repete a iteração
        }

        if (sexo == "F") {
            mulheres++
            somaPesoMulheres += peso
            totalMulheres++
        } else if (sexo == "M") {
            if (peso > 100) {
                homensAcima100kg++
            }
            if (peso > maiorPesoHomem) {
                maiorPesoHomem = peso
            }
        }
    }

    val mediaPesoMulheres = if (totalMulheres > 0) somaPesoMulheres / totalMulheres else 0.0

    println("\nResultados:")
    println("🔹 Quantidade de mulheres cadastradas: $mulheres")
    println("🔹 Homens com mais de 100kg: $homensAcima100kg")
    println("🔹 Média de peso entre as mulheres: %.2f kg".format(mediaPesoMulheres))
    println("🔹 Maior peso entre os homens: %.2f kg".format(maiorPesoHomem))
}

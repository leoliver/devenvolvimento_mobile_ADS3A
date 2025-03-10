//• Desenvolva um aplicativo que leia o peso e a altura de 7
//pessoas, mostrando no final:
//• Qual foi a média de altura do grupo
//• Quantas pessoas pesam mais de 90Kg
//• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//• Quantas pessoas que medem mais de 1.90m pesam mais de
//100Kg.

fun main() {
    var somaAltura = 0
    var pessoasMais90kg = 0
    var pessoasMenos50kgMenos160cm = 0
    var pessoasMais190cmMais100kg = 0
    var qtd = 0

    while (qtd < 7) {
        print("Digite o peso da pessoa ${qtd + 1} (Kg): ")
        val peso = readLine()!!.toDouble()

        print("Digite a altura da pessoa ${qtd + 1} (m): ")
        val altura = readLine()!!.toInt()

        somaAltura += altura

        if (peso > 90) {
            pessoasMais90kg++
        }
        if (peso < 50 && altura < 1.60) {
            pessoasMenos50kgMenos160cm++
        }
        if (altura > 1.90 && peso > 100) {
            pessoasMais190cmMais100kg++
        }

        qtd++
    }

    val mediaAltura = somaAltura / 7

    println("Média de altura do grupo: %.2f m".format(mediaAltura))
    println("Pessoas com mais de 90Kg: $pessoasMais90kg")
    println("Pessoas com menos de 50Kg e menos de 1.60m: $pessoasMenos50kgMenos160cm")
    println("Pessoas com mais de 1.90m e mais de 100Kg: $pessoasMais190cmMais100kg")
}
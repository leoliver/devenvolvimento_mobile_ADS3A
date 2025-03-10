//Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
//equação do segundo grau e mostre o valor de Delta. (formula Δ = b
//2 – 4ac)

fun main() {
    print("Digite o Valor de A ")
    val A = readln().toDouble()
    print("Digite o Valor de B ")
    val B = readln().toDouble()
    print("Digite o Valor de C ")
    val C = readln().toDouble()

    val delta = (B*B)-(4*A*C)

    println("O Valor de Delta é $delta")

}
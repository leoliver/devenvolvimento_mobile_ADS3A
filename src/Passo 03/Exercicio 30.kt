//30 - [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
//
//EQUILÁTERO → todos os lados iguais
//ISÓSCELES → dois lados iguais
//ESCALENO → todos os lados diferentes
fun main() {
    // Solicita ao usuário os comprimentos dos três segmentos de reta
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toDouble()

    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toDouble()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toDouble()

    // Verifica se é possível formar um triângulo com os segmentos fornecidos
    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com esses segmentos.")

        // Classificação do triângulo
        when {
            a == b && b == c -> println("O triângulo é EQUILÁTERO (todos os lados iguais).")
            a == b || a == c || b == c -> println("O triângulo é ISÓSCELES (dois lados iguais).")
            else -> println("O triângulo é ESCALENO (todos os lados diferentes).")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}
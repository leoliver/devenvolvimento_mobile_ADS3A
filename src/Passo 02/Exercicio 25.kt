//25- [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
//Regra Matemática: Para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readln().toDouble()

    print("Digite o comprimento do segundo segmento: ")
    val b = readln().toDouble()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readln().toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com esses segmentos.")
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}
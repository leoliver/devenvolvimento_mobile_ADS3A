//• Crie um algoritmo que leia o valor inicial da contagem, o
//valor final e o incremento, mostrando em seguida todos os
//valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
// Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!

fun main() {
    var primeiroValor = 3
    var ultimoValor = 10
    var incremento = 2
    while (primeiroValor <= ultimoValor) {
        print("$primeiroValor ")
        primeiroValor += incremento
    }
    print("Acabou!")
}
//• Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.
//
fun main (){
    var qtd = 0
    var soma = 0
    while (qtd < 7){
        print("Digite um numero: ")
        val numero = readLine()!!.toInt()
        soma += numero
        qtd ++
    }
    print("soma $soma")
}
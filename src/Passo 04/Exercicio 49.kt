//• Crie um programa que leia 6 números inteiros e no final mostre
//quantos deles são pares e quantos são ímpares.
//
fun main(){
    var par = 0
    var impar = 0
    var qtd = 1
    while (qtd <= 6){
        print("Digte um numero inteiro: ")
        val numero = readLine()!!.toInt()
        if (numero %2 == 0){
            par += 1
        }else{
            impar += 1
        }
        qtd ++
    }
    print("numeros impares: $impar numeros pares: $par")
}
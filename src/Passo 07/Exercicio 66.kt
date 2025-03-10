/*• Escreva um programa que leia um número qualquer e mostre a
tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5*/

fun main(){
    print("Digite um numero: ")
    val numero = readln().toInt()
    for (i in 1..10){
        val mult = i * numero
        println("$i * $numero = $mult")
    }
}
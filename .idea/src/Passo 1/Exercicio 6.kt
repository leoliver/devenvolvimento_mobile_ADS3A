//7
//Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt();
    val antecessor = numero - 1;
    val sucessor = numero + 1;
    println("antecessor: $antecessor");
    println("sucessor $sucessor");

}
//11 Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

fun main() {
    print("Digite a Largura: ")
    val largura = readln().toDouble();

    print("Digite a Altura: ")
    val altura = readln().toDouble();

    val area = altura * altura
    val quantidade = area / 2

    println("Sera nescessario $quantidade litros de tinta para pintar $area metros quadrados ")

}
//14 Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

fun main() {
    print("Digite seu salario: ");
    val salario = readln().toDouble();
    print("porcentagem de bonus: ");
    val bonus = readln().toDouble();
    val salario_novo = salario+ (salario * (bonus/100));
    println("O valor do salario apos o aumento é de $salario_novo R$")
}
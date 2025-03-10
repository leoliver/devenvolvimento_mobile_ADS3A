//16 Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
//hora trabalhada.

fun main() {
    print("Numero de dias trabalhados: ");
    val dias_trabalhados = readLine()!!.toInt();
    val horas_trabalhados = dias_trabalhados * 8;
    val salario = horas_trabalhados * 25;

    println("salario: $salario");
}
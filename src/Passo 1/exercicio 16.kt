//17 [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
//de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
//ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.

fun main() {
    print("Quantidade de cigarros por dia: ");
    val quantidade = readln().toDouble();
    print("Quantos anos vc ficou fumando: ");
    val anos = readln().toDouble();

    val dias_perdidos = (((365 * anos) * quantidade) * 10) / 1440

    println("Você perdeu $dias_perdidos da sua vida");
}
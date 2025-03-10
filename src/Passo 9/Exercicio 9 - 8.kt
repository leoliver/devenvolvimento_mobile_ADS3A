/*Faça um programa que tenha um procedimento chamado Contador()
que recebe três valores como parâmetro: o início, o fim e o
incremento de uma contagem. O programa principal deve solicitar a
digitação desses valores e passá-los ao procedimento, que vai
mostrar a contagem na tela.*/

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    var i = inicio
    while(i <= fim){
        print("$i >> ");
        i += incremento;
    }
    print("FIM")
}

fun main() {
    print("Digite o valor de início: ");
    val inicio = readln().toInt();

    print("Digite o valor do fim: ");
    val fim = readln().toInt();

    print("Digite o valor do incremento: ");
    val incremento = readln().toInt();

    Contador(inicio, fim, incremento);
}
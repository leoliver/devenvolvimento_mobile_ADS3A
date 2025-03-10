/*Desenvolva um algoritmo que leia dois valores pelo teclado e
passe esses valores para um procedimento Maior() que vai
verificar qual deles é o maior e mostrá-lo na tela. Caso os dois
valores sejam iguais, mostrar uma mensagem informando essa
característica.*/

fun Maior(value1: Int, value2: Int){
    if(value1 > value2){
        println("$value1 > $value2")
    } else if(value2 > value1){
        println("$value2 > $value1")
    } else {
        println("$value1 == $value2")
    }
}

fun main() {
    print("Digite o valor 1: ");
    var val1 = readln().toInt();

    print("Digite o valor 2: ");
    var val2 = readln().toInt();
    
    Maior(val1, val2);
}
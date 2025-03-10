/*Crie uma lógica que leia um número inteiro e passe para um
procedimento ParOuImpar() que vai verificar e mostrar na tela
se o valor passado como parâmetro é PAR ou ÍMPAR.*/

fun ParOrImpar(num: Int){
    if(num%2==0){
        println("$num é par");
    } else {
        println("$num é ímpar");
    }
}

fun main() {
    print("Digite o valor: ");
    var num = readln().toInt();
    ParOrImpar(num);
}
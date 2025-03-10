/*Desenvolva um aplicativo que tenha um procedimento
chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados
na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.*/

fun Fibonacci(final: Int) {

    if(final <= 0){
        println("Por favor, insira um número maior que zero.");
        return;
    }

    var primeiro = 1;
    var segundo = 1;

    for (i in 1..final) {
        print("$primeiro >> ");
        val proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }
    println("FIM");
}

fun main() {
    print("Digite a quantidade de números da sequência de Fibonacci: ");
    val final = readln().toInt();

    Fibonacci(final);
}
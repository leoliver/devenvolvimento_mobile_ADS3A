/*• Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

0 5 10 15 20 25 30 35 40 Acabou!*/

fun main(){
    var numero = 0
    for (i in 1..19) {
        println("$numero")
        numero += 5
    }
}

/*• Crie um programa que mostre na tela a seguinte contagem,
usando a estrutura “faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */

fun tabuada3(a: Int): Unit{
    for (i in 0..10){
        var mult = a*i
        println("3 x $i = $mult")
    };
}

fun main(){
    tabuada3(3)
}
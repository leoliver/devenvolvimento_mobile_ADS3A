//• Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou!

fun main (){
    var i = 100
    while (i >= 80){
        println(i)
        i -= 5
    }
    print("Acabou!")
}
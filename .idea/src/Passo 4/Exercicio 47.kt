//• Crie um programa que calcule e mostre na tela o resultado da
//soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
//
fun main (){
    var i = 6
    var soma = 0
    while (i <= 100){
        print(i)
        soma += i

        if (i < 100){
            print("+")
        }
        i += 2
    }
    println(" = $soma")
}
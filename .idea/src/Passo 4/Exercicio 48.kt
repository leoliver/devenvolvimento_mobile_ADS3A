//• Desenvolva um aplicativo que mostre na tela o resultado da
//expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
//
fun main(){
    var soma = 0
    var i = 500
    while (i >= 0){
        print(i)
        soma += i

        if (i > 0){
            print("+")
        }
        i -= 50
    }
    print("= $soma")
}
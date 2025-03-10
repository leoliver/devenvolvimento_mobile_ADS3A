//• Faça um aplicativo que leia o preço de 8 produtos. No final,
//mostre na tela qual foi o maior e qual foi o menor preço
//digitados.

fun main (){
    var maiorPreco: Int? = null
    var menorPreco: Int? = null
    var qtd = 1
    while (qtd < 9){
        print("Digite o preço do produto $qtd: ")
        val preço =  readLine()!!.toInt()

        if(maiorPreco == null || preço > maiorPreco){
            maiorPreco = preço
        }

        if(menorPreco == null || preço < menorPreco){
            menorPreco  = preço
        }
        qtd ++
    }
    println("Maior preço : $maiorPreco")
    println("Menor preço : $menorPreco")
}
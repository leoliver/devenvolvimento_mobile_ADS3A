fun Gerador3(mensagem: String, qtd: Int){
    //pontos = intervalo de tempo
    for (i in 1..qtd){
        println("______________________")
        println("       $mensagem     ")
        println("______________________")

    }
}

fun main (){

    println("Digite sua mensagem: ")
    var mensagem = readln().toString()
    Gerador3(mensagem, 2)
}
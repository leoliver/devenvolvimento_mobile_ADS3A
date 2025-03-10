fun Gerador4(mensagem: String, qtd: Int, tipoborda: Int){

    if (tipoborda == 1){
        for (i in 1..qtd) {
            println("______________________")
            println("       $mensagem      ")
            println("______________________")
        }
    }
    else if (tipoborda == 2) {
        for (i in 1..qtd) {
            println("++++++++++++++++++++++")
            println("       $mensagem      ")
            println("++++++++++++++++++++++")
        }
    }
    else if (tipoborda == 3) {

        for (i in 1..qtd) {
            println("~~~~~~~~~~~~~~~~~~~~~")
            println("      $mensagem      ")
            println("~~~~~~~~~~~~~~~~~~~~~")
        }
    }

}

fun main (){

    println("Digite sua mensagem: ")
    var mensagem = readln()
    Gerador4(mensagem, 2, 3)
}
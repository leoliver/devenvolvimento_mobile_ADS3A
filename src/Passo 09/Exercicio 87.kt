fun Gerador2(mensagem: String){

    println("______________________")
    println("       $mensagem      ")
    println("______________________")
}

fun main () {
    println("Digite sua mensagem: ")
    var mensagem = readln().toString()
    Gerador2(mensagem)
}
fun soma() {
    var soma = 0
    var flag = true
    while (flag) {
        print("Digite um número:")
        var num = readln()!!.toInt()
        if(num != 1111){
            soma += num
        } else{
            print("Soma encerrada!")
            flag = false
        }
    }
}
fun main(){
    print("Deseja somar números?")
    var resposta = readln()
    var respostatratada = resposta.lowercase()
    if (respostatratada == "sim") {
        soma()
    } else{
        println("OK")
    }
}

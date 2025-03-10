//• O programa acima vai ter um problema quando digitarmos o
//primeiro valor maior que o último. Resolva esse problema com um
//código que funcione em qualquer situação.
//
fun main() {
    print("Digite seu primeiro valor: ")
    var primeiroValor = readLine()!!.toInt()
    print("Digite seu último valor: ")
    var ultimoValor = readLine()!!.toInt()
    print("Digite seu incremento: ")
    var incremento = readLine()!!.toInt()

    if (primeiroValor > ultimoValor) {
        print("Ocorreu um erro!! o primeiro valor não pode ser maior que o ultimo!")
    }else{
        while  (primeiroValor <= ultimoValor){
            print("$primeiroValor ")
            primeiroValor += incremento
        }
        print("Acabou!")
    }
}
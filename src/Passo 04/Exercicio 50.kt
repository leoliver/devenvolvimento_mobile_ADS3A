
//• Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//
//• Quais foram os números sorteados
//• Quantos números estão acima de 5
//• Quantos números são divisíveis por 3

import kotlin.random.Random

fun main(){
    var numerosAcimaDe5 = 0
    var numerosDivisiveisPor3 = 0
    var qtd = 0
    while (qtd < 20){
        val numero = Random.nextInt(0 , 11)
        println("numero aleatório: $numero ")

        if (numero >  5){
            numerosAcimaDe5 ++
        }

        if (numero %3 ==0 ){
            numerosDivisiveisPor3 ++
        }
        qtd ++
    }
    println("Numero acima de 5: $numerosAcimaDe5")
    println("Numero dividido por 3: $numerosDivisiveisPor3")
}
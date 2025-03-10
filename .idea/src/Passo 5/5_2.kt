fun main(){
    var salarioMas: Double = 0.0
    var salarioFem: Double = 0.0
    var numFun = 1
    var flag = true
    while (flag){
        print("Qual o salario do funcionário $numFun?")
        var salario = readln()!!.toDouble()
        print("Qual o sexo do funcionário $numFun? (M)/(F)")
        var sex = readln()
        if (sex == "M"){
            salarioMas += salario
        } else if(sex == "F"){
            salarioFem += salario
        } else {
            print("Digite apenas 'M' ou 'F'.")
        }
        print("Quer adicionar mais?")
        var resposta = readln()
        if (resposta == "sim"){
            numFun += 1
            continue
        } else {
            flag = false
        }
    }
    println("Salário Masculino: $salarioMas")
    println("Salário Feminino: $salarioFem")
}
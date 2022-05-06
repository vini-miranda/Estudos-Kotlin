fun condicionais(){

    val titular = "Vinicius Miranda" //variável imutável
    val numeroConta = 1000
    var saldo = 0.0

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo: R$$saldo")

    if(saldo > 0.0){
        println("Conta é positiva")
    }
    else{
        println("Conta é neutra ou negativa")
    }
}
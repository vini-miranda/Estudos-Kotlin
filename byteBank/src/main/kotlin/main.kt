fun main() {
    println("Bem vindo ao ByteBank")
    val conta1 = Conta()
    conta1.titular = "Vini"
    conta1.saldo = 10.0
    val conta2 = Conta()
    conta2.titular = "Kiss"

    println("TITULAR: " + conta1.titular)
    println("SALDO: R$" + conta1.saldo)
    conta1.depositar(50.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.sacar(25.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.transferir(conta2,45.0)
    println("SALDO: R$" + conta1.saldo)
    println("SALDO: R$" + conta2.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(valor: Double){
        println("Deposito efetuado!")
        this.saldo += valor
    }

    fun sacar(valor: Double){
        when {
            this.saldo <= valor -> println("Saldo insuficiente para saque!")
            else -> {
                println("Saque efetuado!")
                saldo -= valor
            }
        }
    }

    fun transferir(contaDestino: Conta, valor: Double){
        if(saldo >= valor){
            this.saldo -= valor
            contaDestino.saldo += valor
            println("Transferencia efetuada com sucesso!")
        }
        else{
            println("aldo insuficiente para transferencia!")
        }
    }
}

fun testaLaco() {
    for (i in 1..5) {
        val titular = "Vinicius Miranda" //variável imutável
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: R$$saldo")
        testaCondicao(saldo)
    }

}

fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva.")

        saldo == 0.0 -> println("Conta é neutra.")
        else -> println("Conta é negativa.")
    }
}
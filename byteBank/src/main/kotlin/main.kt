fun main() {
    println("Bem vindo ao ByteBank")
    val conta1 = Conta("Vini", 10)
    conta1.depositar(10.0)
    val conta2 = Conta("Kiss", 20)
    conta2.titular = "Kiss"

    println("TITULAR: " + conta1.titular)
    println("NUMERO DA CONTA: " + conta1.numero)
    println("SALDO: R$" + conta1.saldo)
    conta1.depositar(50.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.sacar(25.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.transferir(conta2, 9.0)
    println("SALDO: R$" + conta1.saldo)
    println("SALDO: R$" + conta2.saldo)
}

class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        println("Deposito efetuado!")
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        when {
            this.saldo <= valor -> println("Saldo insuficiente para saque!")
            else -> {
                println("Saque efetuado!")
                saldo -= valor
            }
        }
    }

    fun transferir(contaDestino: Conta, valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
            contaDestino.depositar(valor)
            println("Transferencia efetuada com sucesso!")
        } else {
            println("saldo insuficiente para transferencia!")
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
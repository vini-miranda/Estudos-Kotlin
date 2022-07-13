open class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        println("Deposito efetuado!")
        this.saldo += valor
    }

    open fun sacar(valor: Double) {
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
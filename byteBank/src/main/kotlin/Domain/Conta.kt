package Domain

abstract class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun depositar(valor: Double) {
        println("Deposito efetuado!")
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)

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
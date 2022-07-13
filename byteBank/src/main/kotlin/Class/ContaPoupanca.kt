package Class

import Domain.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        when {
            this.saldo <= valor -> println("Saldo insuficiente para saque!")
            else -> {
                println("Saque efetuado!")
                saldo -= valor
            }
        }
    }
}
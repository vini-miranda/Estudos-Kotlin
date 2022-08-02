package Class

import Domain.Conta
import exeception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (valorComTaxa > saldo) {
            throw SaldoInsuficienteException("Saldo insuficiente para saque! Saldo Atual: $saldo")
        }
        println("Saque efetuado!")
        saldo -= valorComTaxa
    }
}
package Class

import Domain.Conta
import exeception.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        if(valor > saldo){
            throw SaldoInsuficienteException("Saldo insuficiente para saque! Saldo Atual: $saldo")
        }
        println("Saque efetuado!")
        saldo -= valor
    }
}
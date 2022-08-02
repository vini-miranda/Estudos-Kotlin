package Domain

import Class.Cliente
import Interface.Autenticavel
import exeception.FalhaAutenticacaoException
import exeception.SaldoInsuficienteException

abstract class Conta(
    val titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set
    companion object {
        var totalContas = 0
            private set
    }

    init {
        totalContas++
    }

    fun depositar(valor: Double) {
        println("Deposito efetuado!")
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(contaDestino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("Saldo insuficiente para saque! Saldo Atual: $saldo")
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor
        contaDestino.depositar(valor)
        println("Transferencia efetuada com sucesso!")
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}
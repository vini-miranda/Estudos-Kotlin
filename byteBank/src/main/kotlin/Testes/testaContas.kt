import Class.Cliente
import Class.ContaCorrente
import Class.ContaPoupanca

fun testaContas() {

    val vini = Cliente("Vini", "123456789-00", senha = 1)
    val rapha = Cliente("Rapha", "123456789-00", senha = 2)

    val contaCorrente = ContaCorrente(vini, 1000)
    val contaPoupanca = ContaPoupanca(rapha, 1001)


    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo Domain.Conta Corrente: R$${contaCorrente.saldo}")
    println("Saldo Domain.Conta Poupança: R$${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo Domain.Conta Corrente: R$${contaCorrente.saldo}")
    println("Saldo Domain.Conta Poupança: R$${contaPoupanca.saldo}")
}
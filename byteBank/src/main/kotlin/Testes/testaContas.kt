import Class.ContaCorrente
import Class.ContaPoupanca

fun testaContas() {
    val contaCorrente = ContaCorrente("Vini", 1000)
    val contaPoupanca = ContaPoupanca("Rapha", 1001)


    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo Domain.Conta Corrente: R$${contaCorrente.saldo}")
    println("Saldo Domain.Conta Poupança: R$${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo Domain.Conta Corrente: R$${contaCorrente.saldo}")
    println("Saldo Domain.Conta Poupança: R$${contaPoupanca.saldo}")
}
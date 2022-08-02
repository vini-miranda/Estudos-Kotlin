import Class.Cliente
import Class.ContaCorrente
import Class.ContaPoupanca
import Class.Endereco

fun testaComportamentos() {

    val vini = Cliente("Vini", "123456789-00", senha = 1, endereco = Endereco(
        logradouro = "Rua Albacora",
        numero = 22
    ))
    val kiss = Cliente("Kiss","789456123-78", senha = 2)

    val conta1 = ContaCorrente(vini, 10)
    conta1.depositar(10.0)
    val conta2 = ContaPoupanca(kiss, 20)


    println("TITULAR: " + conta1.titular.nome)
    println("ENDEREÇO: ${vini.endereco.logradouro} ${vini.endereco.numero}")
    println("NUMERO DA CONTA: " + conta1.numero)
    println("SALDO: R$" + conta1.saldo)
    conta1.depositar(50.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.sacar(25.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.transferir(contaDestino = conta2, valor = 9.0, senha = 1)
    println("SALDO: R$" + conta1.saldo)
    println("SALDO: R$" + conta2.saldo)

    conta2.transferir(contaDestino = conta1, valor = 5.0, senha = 1)
    println("SALDO: R$" + conta1.saldo)
    println("SALDO: R$" + conta2.saldo)
}
fun testaComportamentos() {
    val conta1 = Conta("Vini", 10)
    conta1.depositar(10.0)
    val conta2 = Conta("Kiss", 20)


    println("TITULAR: " + conta1.titular)
    println("NUMERO DA CONTA: " + conta1.numero)
    println("SALDO: R$" + conta1.saldo)
    conta1.depositar(50.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.sacar(25.0)
    println("SALDO: R$" + conta1.saldo)
    conta1.transferir(contaDestino = conta2, valor = 9.0)
    println("SALDO: R$" + conta1.saldo)
    println("SALDO: R$" + conta2.saldo)
}
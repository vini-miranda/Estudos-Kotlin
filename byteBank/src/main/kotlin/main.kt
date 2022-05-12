fun main() {
    println("Bem vindo ao ByteBank")
    val conta1 = Conta()
    conta1.titular = "Vini"
    conta1.saldo = 10.0
    val conta2 = Conta()
    conta2.titular = "Kiss"

    println("TITULAR: " + conta1.titular)
    println("SALDO: R$" + conta1.saldo)
    conta1.deposita(50.0)
    println("SALDO: R$" + conta1.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double){
        println("Deposito efetuado!")
        this.saldo += valor
    }
}

fun testaLaco() {
    for (i in 1..5) {
        val titular = "Vinicius Miranda" //variável imutável
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: R$$saldo")
        testaCondicao(saldo)
    }

}

fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva.")

        saldo == 0.0 -> println("Conta é neutra.")
        else -> println("Conta é negativa.")
    }
}
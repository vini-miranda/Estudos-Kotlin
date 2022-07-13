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
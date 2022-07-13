fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("Domain.Conta é positiva.")

        saldo == 0.0 -> println("Domain.Conta é neutra.")
        else -> println("Domain.Conta é negativa.")
    }
}
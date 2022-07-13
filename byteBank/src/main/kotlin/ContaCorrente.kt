class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        when {
            this.saldo <= valorComTaxa -> println("Saldo insuficiente para saque!")
            else -> {
                println("Saque efetuado!")
                saldo -= valorComTaxa
            }
        }
    }
}
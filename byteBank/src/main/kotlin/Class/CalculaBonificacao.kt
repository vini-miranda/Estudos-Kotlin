package Class

import Domain.Funcionario

class CalculaBonificacao {

    var total: Double = 0.0
        private set

    fun somaBonificacao(list: MutableList<Any>): Double{
            list.forEach {
                it as Funcionario
                this.total += it.bonificacao
            }
            return total
    }
}
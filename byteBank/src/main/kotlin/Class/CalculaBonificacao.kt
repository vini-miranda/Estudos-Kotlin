package Class

import Domain.Funcionario

class CalculaBonificacao {

    var total: Double = 0.0
        private set

    fun somaBonificacao(list: MutableList<Funcionario>): Double{
        list.forEach {
            this.total += it.bonificacao
        }
        return total
    }
}
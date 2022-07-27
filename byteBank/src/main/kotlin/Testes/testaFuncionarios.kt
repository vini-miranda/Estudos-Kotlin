import Class.Analista
import Class.CalculaBonificacao
import Class.Diretor
import Class.Gerente
import Domain.Funcionario

fun testaFuncionarios() {
    val vini = Analista("Vini", "123456789-00", 1000.0)
    val vitor = Gerente("Vitor", "32546879-12", 2000.0, 1234)
    val rapha = Diretor("Raphaela", "987654321-22", 3000.0, 4321, 200.0)
    val burilo = Analista("Murilo", "987456312-88", 3000.0)

    println("Nome: ${vini.nome}" + " | CPF: ${vini.cpf}" + " | Salario: R$${vini.salario}")
    println("Bonificacao: R$${vini.bonificacao}")
    linha()

    println("Nome: ${vitor.nome}" + " | CPF: ${vitor.cpf}" + " | Salario: R$${vitor.salario}")
    println(vitor.autentica(124))
    println("Bonificacao: R$${vitor.bonificacao}")
    linha()

    println("Nome: ${rapha.nome}" + " | CPF: ${rapha.cpf}" + " | Salario: R$${rapha.salario}" + " | PLR: R$${rapha.plr}")
    println(rapha.autentica(4321))
    println("Bonificacao: R$${rapha.bonificacao}")
    linha()

    println("Nome: ${burilo.nome}" + " | CPF: ${burilo.cpf}" + " | Salario: R$${burilo.salario}")
    println("Bonificacao: R$${burilo.bonificacao}")
    linha()

    val list: MutableList<Any> = mutableListOf(vini, vitor, rapha, burilo, "ok")
    var soma = CalculaBonificacao().somaBonificacao(list)

    println("Total de bonificacao: R$$soma")
}

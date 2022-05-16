fun main() {
    println("Bem vindo ao ByteBank")
    val vini = Funcionario("Vini","123456789-00",2000.0)

    println("Nome: ${vini.nome}" + " | CPF: ${vini.cpf}" + " | Salario: R$${vini.salario}")
    println("Bonificacao: R$${vini.bonificacao()}")
}
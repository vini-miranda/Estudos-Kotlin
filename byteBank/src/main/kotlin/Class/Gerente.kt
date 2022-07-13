package Class

import Domain.FuncionarioAdmin

open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(nome,cpf,salario,senha){

     override val bonificacao: Double
        get() {
            return salario * 0.2
        }
}
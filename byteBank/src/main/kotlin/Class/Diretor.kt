package Class

import Domain.FuncionarioAdmin

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
): FuncionarioAdmin(nome,cpf,salario,senha){

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }
}
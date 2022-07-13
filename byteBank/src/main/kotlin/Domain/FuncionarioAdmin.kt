package Domain

import Domain.Funcionario
import Interface.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(nome,cpf,salario), Autenticavel {

    abstract override val bonificacao: Double

    override fun autentica(senha:Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }

}
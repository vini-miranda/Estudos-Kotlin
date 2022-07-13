open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(nome,cpf,salario,senha) {

     override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    override fun autentica(senha:Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}
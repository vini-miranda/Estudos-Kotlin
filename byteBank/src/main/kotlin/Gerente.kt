open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
): Funcionario(nome,cpf,salario) {

    override fun bonificacao(): Double{
        return salario * 0.2
    }

    fun autentica(senha:Int): String {
        if (this.senha == senha){
            return "Autenticado com sucesso"
        }
        return "Falha na autenticacao"
    }
}
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(nome,cpf,salario) {

    abstract override val bonificacao: Double

    abstract fun autentica(senha: Int): Boolean

}
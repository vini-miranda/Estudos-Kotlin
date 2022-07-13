class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
): Gerente(nome,cpf,salario,senha), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }
}
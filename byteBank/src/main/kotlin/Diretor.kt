class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
): Gerente(nome,cpf,salario,senha) {

    override fun bonificacao(): Double{
        return salario * 0.3
    }

}
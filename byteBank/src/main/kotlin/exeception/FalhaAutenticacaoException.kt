package exeception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na Autenticação"
) : Exception(mensagem)
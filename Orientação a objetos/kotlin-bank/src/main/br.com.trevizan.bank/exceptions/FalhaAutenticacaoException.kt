package exceptions

class FalhaAutenticacaoException (
    mensagem: String = "Falha na autenticação"
): Exception (mensagem) {
}
package exceptions

class SaldoInsuficienteException (
    mensagem : String = "Saldo insuficiente"
) : Exception(mensagem) {

}
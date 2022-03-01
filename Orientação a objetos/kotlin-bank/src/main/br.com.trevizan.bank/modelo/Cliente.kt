package modelo

class Cliente (
    val nome: String,
    val cpf : String,
    private val senha: String,
    var endereco : Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: String): Boolean {
        return when {
            this.senha != senha -> false
            else -> true
        }
    }
}
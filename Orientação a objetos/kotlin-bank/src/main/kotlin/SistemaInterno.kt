class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha : String) : Boolean{
        return  autenticavel.autentica(senha)
    }
}

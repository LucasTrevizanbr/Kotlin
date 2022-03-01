package modelo

import java.math.BigDecimal

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: BigDecimal,
    protected val senha : String

): Funcionario(nome = nome, cpf = cpf, salario = salario)
, Autenticavel {

    override fun autentica(senha: String): Boolean {
        return when {
            this.senha != senha -> false
            else -> true
        }
    }
}



package modelo

import modelo.FuncionarioAdmin
import java.math.BigDecimal
import java.math.RoundingMode

class Gerente(
    nome : String,
    cpf : String,
    salario : BigDecimal,
    senha : String
 ): FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha){

    override val bonificacao: BigDecimal
        get() {
            return salario.setScale(2, RoundingMode.HALF_UP)
        }
}
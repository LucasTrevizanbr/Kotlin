import java.math.BigDecimal
import java.math.RoundingMode

class Diretor(
    nome : String,
    cpf : String,
    salario : BigDecimal,
    senha : String,
    private val plr : BigDecimal
):FuncionarioAdmin (nome = nome, cpf = cpf, salario = salario, senha = senha){

    override val bonificacao: BigDecimal get() = plr.plus(salario).setScale(2, RoundingMode.HALF_UP)

}
import java.math.BigDecimal
import java.math.RoundingMode

class Analista(nome: String,
               cpf: String,
               salario: BigDecimal
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: BigDecimal get() = salario.multiply(BigDecimal(0.10))
        .setScale(2,RoundingMode.HALF_UP)
}
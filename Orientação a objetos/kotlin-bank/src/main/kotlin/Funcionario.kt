import java.math.BigDecimal
import java.math.RoundingMode

abstract class Funcionario(
    val nome: String,
    val cpf : String,
    var salario : BigDecimal

){
    abstract val bonificacao: BigDecimal
}



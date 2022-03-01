import modelo.Funcionario
import java.math.BigDecimal

class CalculadoraBonificacao {

    var total: BigDecimal = BigDecimal(0.0)
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}
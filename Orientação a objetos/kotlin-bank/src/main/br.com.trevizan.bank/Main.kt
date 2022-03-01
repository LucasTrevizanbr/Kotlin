import modelo.Funcionario
import java.math.BigDecimal

fun main(args: Array<String>) {


    var total: BigDecimal = BigDecimal(0)

    fun converte (funcionarioAny : Any){
        if(funcionarioAny is Funcionario){
            total = funcionarioAny.bonificacao;
        }

    }

}


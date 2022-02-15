import java.math.BigDecimal

abstract class Conta (
    val nome :String,
    val numeroConta: String)
{
    var saldo = BigDecimal(0.0)
    private set

    fun deposita(valor: BigDecimal){
        this.saldo += valor
    }

    abstract fun saca(valor: BigDecimal)
}
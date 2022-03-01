package modelo

import java.math.BigDecimal

abstract class Conta (
    val titular :Cliente,
    val numeroConta: String)
{
    var saldo = BigDecimal(0.0)
    private set

    companion object Contador {
        var total: Int = 0
         private set
    }

    init {
        print("Criando conta")
        Contador.total++;
    }

    fun deposita(valor: BigDecimal){
        this.saldo += valor
    }

    abstract fun saca(valor: BigDecimal)
}
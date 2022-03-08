package modelo

import exceptions.FalhaAutenticacaoException
import exceptions.SaldoInsuficienteException
import java.math.BigDecimal

abstract class Conta (
    val titular :Cliente,
    val numeroConta: String,
) : Autenticavel
{
    var saldo = BigDecimal(0.0)
    private set

    companion object Contador {
        var total: Int = 0
         private set
    }

    init {
        Contador.total++;
    }

    override fun autentica(senha: String): Boolean {
        return this.titular.autentica(senha)
    }

    fun deposita(valor: BigDecimal){
        this.saldo += valor
    }

    fun transfere(valor: BigDecimal, destino : Conta, senha : String){
        if(this.saldo < valor){
            throw SaldoInsuficienteException()
        }

        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor);
    }

    abstract fun saca(valor: BigDecimal)
}
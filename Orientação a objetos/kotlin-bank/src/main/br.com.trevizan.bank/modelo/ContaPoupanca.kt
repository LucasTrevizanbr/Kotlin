package modelo

import java.math.BigDecimal

class ContaPoupanca(
    titular: Cliente,
    numeroConta : String
) : Conta(titular = titular, numeroConta = numeroConta){

    override fun saca(valor : BigDecimal){
        val valorComTaxa = valor.plus(BigDecimal(0.2))

        if (this.saldo > valorComTaxa){
            this.saldo.minus(valorComTaxa)
        }
    }
}
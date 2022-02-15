import java.math.BigDecimal

class ContaCorrente(
    nome: String,
    numeroConta : String
) :Conta(nome = nome, numeroConta = numeroConta){

    override fun saca(valor : BigDecimal){
        val valorComTaxa = valor.plus(BigDecimal(0.1))

        if(this.saldo > valorComTaxa){
            this.saldo.minus(valorComTaxa)
        }
    }
}
import java.math.BigDecimal

class ContaPoupanca(
    nome: String,
    numeroConta : String
) :Conta(nome = nome, numeroConta = numeroConta){

    override fun saca(valor : BigDecimal){
        val valorComTaxa = valor.plus(BigDecimal(0.2))

        if (this.saldo > valorComTaxa){
            this.saldo.minus(valorComTaxa)
        }
    }
}
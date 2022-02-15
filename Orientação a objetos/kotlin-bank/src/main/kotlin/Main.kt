import java.math.BigDecimal

fun main(args: Array<String>) {

    val jarlos = Gerente("Jarlos","12232323", BigDecimal(1000.00),"olaMario")
    val marlas = Diretor("Marlas","12232324",BigDecimal(2000.00),"olamaikon", BigDecimal(0.1))
    val mialdo = Cliente("Mialdo","777666","Dale")

    val sistemaInterno = SistemaInterno()
    println(sistemaInterno.entra(jarlos, "olaMario"))
    println(sistemaInterno.entra(marlas,"olamaikon" ))
    println(sistemaInterno.entra(mialdo,"Dale" ))
}


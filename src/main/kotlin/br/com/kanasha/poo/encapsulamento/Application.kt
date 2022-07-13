package br.com.kanasha.poo.encapsulamento

import java.math.BigDecimal

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            //calculadora.somar(BigDecimal.ONE)
            calculadora.somar(BigDecimal("50"))
//            calculadora.subtrair((BigDecimal(2)))
            calculadora.dividir(BigDecimal("10"))
        }
    }
}
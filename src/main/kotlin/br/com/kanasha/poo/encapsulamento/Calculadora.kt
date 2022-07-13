package br.com.kanasha.poo.encapsulamento

import java.math.BigDecimal
import java.math.RoundingMode

class Calculadora {
    /*
    public
    private
    protected
     */
    private var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal){
        resultado += a
        getResultado()
    }

    fun subtrair(a: BigDecimal){
        resultado -= a
        getResultado()
    }

    fun multiplicar(a: BigDecimal){
        resultado *= a
        getResultado()
    }

    fun dividir(a: BigDecimal){
        resultado = resultado.divide(a, 8, RoundingMode.HALF_UP)
        getResultado()
    }

    private fun getResultado() {
        println("O resultado é: $resultado")
    }
}
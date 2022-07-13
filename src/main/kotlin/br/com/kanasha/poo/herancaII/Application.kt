package br.com.kanasha.poo.herancaII


import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ricardo = Pessoa("12345678910", "Ricardo", LocalDate.of(1989, 7, 7))
            //ricardo.falar("Olá mundo da programação orientada a objetos!")
            ricardo.adotar(Gato())
            ricardo.adotar(Cachorro())
            ricardo.adotar(Peixe())
            for(animal in ricardo.animaisAdotados){
                when{
                    animal is Cachorro -> animal.latir()
                    animal is Gato -> animal.miar()
                    animal is Peixe -> println("é um peixe")
                    animal is Mamifero -> println("é um mamifero")
                }
                //(animal as? Gato)?.miar()  // cast, mesmo cachorro não sendo gato, podemos fazer desta forma
                //(animal as? Cachorro)?.latir()
            }
        }
    }
}
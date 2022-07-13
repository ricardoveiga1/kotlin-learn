package br.com.kanasha.poo.polimorfismo


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
                animal.comunicar()
            }
        }
    }
}
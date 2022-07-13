package br.com.kanasha.poo.polimorfismo

class Gato: Mamifero() {

    fun miar(){
        println("miau")
    }

    override fun comunicar() {
        miar()
    }

}
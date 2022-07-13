package br.com.kanasha.poo.polimorfismo

class Cachorro: Mamifero() {

    fun latir(){
        println("uau uau")
    }

    override fun comunicar() {
        latir()
    }

}
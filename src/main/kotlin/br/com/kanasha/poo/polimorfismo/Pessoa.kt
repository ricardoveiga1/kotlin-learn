package br.com.kanasha.poo.polimorfismo

import java.time.LocalDate
//quando crio uma variável q não será alterada, crio com VAL
//get e set são construidos pro tras dos panos
class Pessoa(
    val cpf: String,
    val nome: String,
    val dtNascimento: LocalDate
){
    val idade = LocalDate.now().year - dtNascimento.year

    var email = ""
        set(value){
            //se não for email correto estoura erro
            if(!Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)){
                throw Exception("Ops! Email invalido.")
            }
            field = value
        }

    val animaisAdotados = mutableListOf<Animal>()

    fun falar(mensagem: String){
        println("$nome falou: $mensagem")
    }

    fun adotar(animal: Animal){
        animaisAdotados.add(animal)
    }
}
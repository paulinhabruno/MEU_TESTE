package Pessoa

class Pessoa {
    var nome: String = "Paula"

    var cpf: String = "123.456.789-11"
    private set

    constructor()

    fun pessoainfo() = "$nome $cpf"

}

fun main() {
    val paula = Pessoa()

    println(paula.pessoainfo())



}
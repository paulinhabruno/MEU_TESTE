package project_pessoa.test

import project_pessoa.Gerente

fun main() {
    val maria = Gerente ("Maria do Carmo", "123456789", salario = 5000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}


package project_pessoa.test

import project_pessoa.Analista

fun main() {
    val joao = Analista ("João Pedro", "123456789", salario = 2000.0)
   ImprimeRelatorioFuncionario.imprime(joao)
}

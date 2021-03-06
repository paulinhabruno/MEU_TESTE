package project_pessoa.test

import project_pessoa.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
       fun imprime(funcionario: Funcionario) {
           println(
               funcionario.toString()
           )
       }
    }
}
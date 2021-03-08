package project_pessoa.test

import project_pessoa.Logavel

class TesteAutenticacao {
    fun autentica(logavel: Logavel) = println(logavel.login())
}
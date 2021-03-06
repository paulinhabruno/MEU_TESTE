package project_pessoa.test

import project_pessoa.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }

        ClienteTipo.values().forEach {
            println("${it.name} - $it")
        }
}
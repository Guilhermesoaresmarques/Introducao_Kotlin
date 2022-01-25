package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val enderecoNulo: Endereco? = null
    println(enderecoNulo?.logadouro)
}
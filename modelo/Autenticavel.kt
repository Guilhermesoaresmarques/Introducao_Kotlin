package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autentifica(senha: Int): Boolean
}
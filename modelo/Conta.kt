package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    private val titular: Cliente,
    val numero: Int
) : Autenticavel {
    companion object {
        var total = 0
            private set
    }

    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        println("depositando $valor na conta do ${this.numero}")
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }

        if (!autentifica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
        println("${titular.nome} trasferiu $valor para ${destino.titular.nome}")
    }

    override fun autentifica(senha: Int): Boolean {
        return titular.autentifica(senha)
    }

    init {
        total++
    }

}
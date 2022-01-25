package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaComportamentosConta () {
    val guilherme = Cliente(nome = "Guilherme", cpf = "111.111.111-11", senha = 12345)

    val conta = ContaCorrente(titular = guilherme, numero = 9)

    conta.deposita(70.0)
    println(conta.saldo)
}
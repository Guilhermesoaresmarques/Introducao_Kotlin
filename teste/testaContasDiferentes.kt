package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val alex = Cliente(nome = "Alex", cpf = "222.222.222-22", senha = 12345)

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val fran = Cliente(nome = "Francisca", cpf = "333.333.333-33", senha = 54321)

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println()
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println()
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor=100.0, destino = contaPoupanca, senha = 12345)

    println()
    println("saldo corrente apos trasferir poupanca ${contaCorrente.saldo}")
    println("saldo poupanca apos receber transferencia ${contaPoupanca.saldo}")
}
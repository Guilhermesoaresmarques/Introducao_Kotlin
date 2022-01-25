package br.com.alura.bytebank.modelo

abstract class FuncionarioAdimin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    abstract fun autentifica(senha: Int): Boolean

}

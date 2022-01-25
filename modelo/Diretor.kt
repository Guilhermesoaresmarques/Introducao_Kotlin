package br.com.alura.bytebank.modelo

class Diretor (
    nome:String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdimin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun autentifica(senha: Int): Boolean {
        if (this.senha == senha) {
            println("${this.nome} se autenticou no sistema")
            return true
        }
        println("${this.nome} tentou se autenticar no sistema mas falhou")
        return false
    }

}
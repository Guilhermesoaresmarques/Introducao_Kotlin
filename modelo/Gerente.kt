package br.com.alura.bytebank.modelo

class Gerente (
    nome:String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario
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
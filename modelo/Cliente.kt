package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    private val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int,
) : Autenticavel {

    override fun autentifica(senha: Int): Boolean {
        if (this.senha == senha) {
            println("${this.nome} se autenticou no sistema")
            return true
        }
        println("${this.nome} tentou se autenticar no sistema mas falhou")
        return false
    }
}
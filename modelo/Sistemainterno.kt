package br.com.alura.bytebank.modelo

class Sistemainterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentifica(senha)) {
            println("bem vindo ao bytebank")
        }
    }


}
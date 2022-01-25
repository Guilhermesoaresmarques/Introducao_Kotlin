package br.com.alura.bytebank.modelo

class Endereco(
    var logadouro: String = "endereco nao registrado",
    var numero: Int = 0,
    var bairro: String = "endereco nao registrado",
    val cidade: String = "endereco nao registrado",
    var estado: String = "endereco nao registrado",
    var cep: String = "endereco nao registrado",
    var complemento: String = ""
) {

}

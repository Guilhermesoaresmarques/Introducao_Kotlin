package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraDeBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionario() {

    val funcionario = Analista(
        nome = "Ze",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${funcionario.nome}")
    println("cpf ${funcionario.cpf}")
    println("salario ${funcionario.salario}")
    println("bonificacao ${funcionario.bonificacao}")

    println()
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")

    fran.autentifica(123)

    println()
    println()

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    println("plr ${gui.plr}")

    gui.autentifica(4000)

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println()
    println()

    val calculadora = CalculadoraDeBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificacao ${calculadora.total}")
}
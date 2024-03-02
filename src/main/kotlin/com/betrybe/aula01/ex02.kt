package com.betrybe.aula01

fun main() {
    print("Digite o salário base: ")
    var salario = readln().toDouble()

    var imposto = calcularImposto(salario)
    var gratificacao = calcularGratificacao(salario)

    println("O salário a receber é igual a ${salario + gratificacao - imposto}")
}

fun calcularGratificacao(salarioBase: Double) = salarioBase * 0.05
fun calcularImposto(salarioBase: Double) = salarioBase * 0.07
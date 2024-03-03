package com.betrybe.aula02
//Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
//calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%

fun calculaSalario(salary: Double): Double {
    return salary * 1.25
}
fun main() {
    println("Digite seu salário: ")
    val salary = readln().toDouble()
    println("Seu salario teve aumento de 25%: ${calculaSalario(salary)}")
}
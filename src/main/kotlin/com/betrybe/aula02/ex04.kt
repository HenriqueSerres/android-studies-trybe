package com.betrybe.aula02

//Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante e mostre a média
//aritmética e a mensagem de acordo com as regras a seguir:
//
//Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
//Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
//Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO

var media: Double = 0.0
fun calcMedia(nota1: Double, nota2: Double, nota3: Double): String {
    media = (nota1 + nota2 + nota3) / 3
    if (media in 0.0..2.0) {
        return "REPROVADO"
    }
    if (media in 3.0..6.0) {
        return "EXAME"
    }
    if (media in 7.0..10.0) {
        return "APROVADO"
    }
    return "Notas Invalidas"
}

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readln().toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readln().toDouble()
    print("Digite a terceira nota: ")
    val nota3 = readln().toDouble()

    println("${calcMedia(nota1, nota2, nota3)} com média: $media")
}
package com.betrybe.aula02

//Escrevas um programa em Kotlin que receba dois números e mostre o maior.

fun isBigger(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun main() {
    print("Digite um numero: ")
    val num1 = readln().toInt()

    print("Digite outro numero: ")
    val num2 = readln().toInt()

    println("O maior numero é ${isBigger(num1, num2)}")
}
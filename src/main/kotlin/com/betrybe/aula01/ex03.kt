package com.betrybe.aula01

import kotlin.math.pow

fun main() {
    println("Digite sua altura: ")
    var altura = readln().toDouble()

    println("Digite seu peso: ")
    var peso = readln().toDouble()

    println("Seu imc é: ${calculaImc(altura, peso)}")
}

fun calculaImc(alt: Double, pes: Double) = pes / alt.pow(2)
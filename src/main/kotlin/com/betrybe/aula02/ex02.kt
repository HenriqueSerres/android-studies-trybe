package com.betrybe.aula02

//Cada degrau de uma escada tem X de altura. Escreva um programa usando Kotlin que receba essa
//altura e a altura que uma pessoa deseja alcançar usando a escada, calcule e mostro quantos
//degraus ela deverá subir para atingir seu objetivo, sem se preocupar com a altura da pessoa.
//Todas as medidas fornecidas devem estar em metros.

fun calcDegraus(altura: Double, altDegraus: Double): Double {
    return altura / altDegraus
}

fun main() {
    println("Digite a altura que deseja alcançar em metros: ")
    val alt = readln().toDouble()
    println("Digite a altura dos degraus da escada em metros: ")
    val altDegrau = readln().toDouble()

    print("Sua escada deve ter ${calcDegraus(alt, altDegrau)} degraus.")


}
package com.betrybe.aula01

fun main() {
    print("Digite um número: ")
    val num1: Int = readln().toInt()

    print("Digite um número: ")
    val num2: Int = readln().toInt()

    print("Digite um número: ")
    val num3: Int = readln().toInt()

//    val media = calculaMedia(num1, num2, num3)

    println("A média é ${calculaMedia(num1, num2, num3)}")
}

//fun calculaMedia(a:Int, b:Int, c:Int): Int {
//    return (a+b+c)/3
//}

fun calculaMedia(a: Int, b: Int, c: Int) = (a + b + c) / 3




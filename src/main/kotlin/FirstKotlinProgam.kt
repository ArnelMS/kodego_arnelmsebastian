fun main() {
/*
author: Arnel
Date Created: 09/01/2022
Filename: FirstKotlinProgman.kt
*/
    println("Enter Number 1:")
    var number1 : Int = readln().toInt()
    println("My Number 1 is $number1")

    println("Enter Number 2:")
    var number2 : Int = readln().toInt()
    println("My Number 2 is $number2")

    var sum : Int = number1 + number2
    println("The sum is $sum")


    lateinit var name: String
    lateinit var age: String
    lateinit var address: String

    println("Enter name")
    name = readln()
    println(name)
}
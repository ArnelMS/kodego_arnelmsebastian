package com.oop

open class Employee{
    var salary: Double = 3000.00
    var bonus: Double = 1000.0

    init{
        println("--------------------------")
        println("New Employee created")
    }

    open fun computeBonus(){
        println("Bonus is $bonus")
    }
}
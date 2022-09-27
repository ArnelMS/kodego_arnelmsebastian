package com.oop

class Manager:Employee(){


    override fun computeBonus(){
        println("Manager Bonus is ")
        println(bonus+(bonus*.10))


    }
}
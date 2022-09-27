package com.oop

class Staff:Employee() {


    override fun computeBonus() {
        println("Staff")
        super.computeBonus()
    }
}
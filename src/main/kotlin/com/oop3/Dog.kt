package com.oop3

class Dog :Animal{
    override fun walk(){
        println("Dog walks")
    }

    override fun makesound(){
        println("Aw aw")
    }

    override fun groom() {
        println("Dog can be groomed")
    }

    override fun feed() {
        println("Dog feeds")
    }

}
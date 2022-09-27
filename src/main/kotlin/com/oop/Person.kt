package com.oop
//Abstraction -> Separate
//Encapsulation (Cannot access variables directly, except using "Get" and "Set")
//Inheritance -> "is-a relationship"
//Override - Many forms / Polymorphism

open class Person(name:String, age:Int) {
    var name    :   String = name
//        get() {return field}    // Getter function
//        set(value){             // Setter function
//            field = value
//        }
    var age     :   Int = age
//        get() {return field}    // Getter function
//        set(value) {             // Setter function
//            if (value < 1) {
//                println("Invalid Age!")
//            } else {
//                field = value
//            }

    init {
        println("Object created!")
        println("Name is $name, age is $age")
    }
    open fun displayName(){
        println(name)
    }

    open fun displayAge(){
        println("age is $age")
    }

//    fun upAge():Int{
//        age++
//        return age
//    }
//
//
}
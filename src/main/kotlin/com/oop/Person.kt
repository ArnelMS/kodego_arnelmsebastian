package com.oop
//Abstraction -> Separate
//Encapsulation (Cannot access variables directly, except using "Get" and "Set")
//inheritance -> "is-a relationship"

open class Person(name:String, age:Int) {
    var name: String = name

    //        get() {return field}    // Getter function
//        set(value){             // Setter function
//            field = value
//        }
    var age: Int = age
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
//override - Many forms / Polymorphism - same name, same parameters
    // different implementation, one is in the superclass
    // one is in the subclass

    open fun displayName() {
        println(name)
    }

    // overloading -> same name(same function name), different parameters, same class
    open fun displayName(name: String) {
        println(name)
    }

    open fun displayName(numberOfTimes: Int) {
        var ctr = numberOfTimes - 1
        while (ctr >= 0) {
            println("Name is $name")
            ctr--
        }


//        open fun displayAge() {
//            println("age is $age")
//        }

//    fun upAge():Int{
//        age++
//        return age
//    }
//
//
    }
}
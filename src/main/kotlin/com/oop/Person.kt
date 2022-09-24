package com.oop
//Abstraction
//encasulation (Cannot access variables directly, except using "Get" and "Set"

open class Person {
    var name    :   String = "John"
        get() {return field}    // Getter function
        set(value){             // Setter function
            field = value
        }
    var age     :   Int = 23
        get() {return field}    // Getter function
        set(value) {             // Setter function
            if (value < 1) {
                println("Invalid Age!")
            } else {
                field = value
            }
        }

    init {
        println("Object created!")
        println("Name is $name, age is $age")
    }
    fun upAge():Int{
        age++
        return age
    }

    open fun  displayName(){
        println(name)
    }

    fun change(age:Int){
        println(age)
    }
}
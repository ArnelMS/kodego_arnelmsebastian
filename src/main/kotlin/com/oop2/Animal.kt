package com.oop2

abstract class Animal {
    //abstract class (reversed is Concrete Class)
    //it can have abstract functions
    //abstract functions are functions without a body/implementation
    //only abstract classes can have abstract functions
    //you cannot create an object from an abstract class
    //abstact is always a superclass only
    //when you inherit from an abstract class, you are REQUIRED to override all
    // REQUIRED to override all its abstract functions
    abstract fun walk()
    abstract fun makeSound()

}
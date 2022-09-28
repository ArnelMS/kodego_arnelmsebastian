package com.oop

class Student (name: String, age: Int) : Person(name, age) {

    var studentId: Int = 0

    fun displayStudentId() {
        println(studentId)
    }

    // Overriding -> "should be the same name"
    // -> function should have be "Open"
    override fun displayName() {
        super.displayName()
        println("displaying function displayName from Student class")

    }

//    override fun displayAge() {
//        println("displaying function displayAge from Student class")
//        super.displayAge()
//    }
}

//polymorphism
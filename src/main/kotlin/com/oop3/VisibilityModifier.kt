package com.oop3

fun main(){
    //public - accessed anywhere (seen by all..) (default)
    //private - within the class only (seen by only me..)
    //protected - within the class and its subclass can be inherited. (friends only...)
    //internal -

    var obj = ClassA()
    println(obj.name)
//    println(obj.age)
//    println(obj.address)

}

open class ClassA(){
    public var name: String = "Peter"
    private var age: Int = 23
    protected var address: String = "NY"
}

class ClassB : ClassA(){
    init {
        println(address)
        //println(age) Can not access.
    }
}
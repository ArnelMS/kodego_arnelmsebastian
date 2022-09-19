fun main() {
    var anne = Person("Anne")
    anne.age = 25
    anne.displayAge()

}
//

class Person (var name: String, var age:Int) { // constructor > Primary constructor

    init { // Initializer - once class is called will start init immediately.
        println("Object Created")
        println("Name is $name")
        println("Age is $age")

    }

    // Secondary constructors
        constructor(name:String):this("Arnel", 43){}
        constructor(age:Int):this("default_name",age){}

//        println("Object Created")
//        println("name is $name")
//        println("name is $age")
    fun walk() {
        println("A person walks")
    }

    fun eat() {
        println("A person eats")
    }
    fun displayAge(){
        //var age : Int = 7
        println(age)
    }

    fun ageUp() {
        age++
    }

    //Global Variable - know on all (fun main, fun, etc...
    // this. refers to the Global variable that have the same variable on local.
}




// FIRST SAMPLE PRESENTATION**********************************************************************
//fun main(){
//    // Sample 1
//    var joe = Person()
////    println(joe.name)
//
//    joe.name = "Joe"  // replace attribute "John" to "Joe"
//    println(joe.name)
//    joe.walk()
//    joe.eat()
//
//
//    // Sample 2
//    var anna = Person()
//    anna.name = "Anna"
//    println(anna.name)
//    joe.walk()
//    joe.eat()
//
//    // Sample 3
//    var mark = Person()
//    mark.name = "Mark"
//    println(mark.name)
//    joe.walk()
//    joe.eat()
//
//}
//
//class Person {
//    // Attributes == Nouns
//    var name : String = "John" // Should always have a Value
//    var age : Int = 21
//
//    // Behaviors == Verbs
//    fun walk(){
//        println("A person walks")
//    }
//    fun eat(){
//        println("A person eats")
//    }
//
//
//}
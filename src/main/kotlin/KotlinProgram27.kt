fun main() {
    var joe = Person("Joe", 21) // Instantiation
    println("***********")
    println("${joe.name}'s curretn age is ${joe.age}")
    println("After 1 year....")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.age}")
}
//

class Person (var name: String, var age:Int){ // constructor

    init{
        println("Object Created")
        println("name is $name")
        println("name is $age")
    }

    // Behaviors == Verbs
    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eats")
    }
    fun ageUp(){
        age++
    }


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
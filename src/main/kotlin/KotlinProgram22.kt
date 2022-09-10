fun main(){

    println("Enter your name: ")
    var name : String = readln()

    println("Enter your age: ")
    var age : Int = readln().toInt()

    displayNameAndAge(name,age)

}
//*********** (out side fun main ) ************************
// no return | no parameter
fun displayName(){
    println("Peter")
}

//no return | with One parameter
fun displayMessage(msg: String){
    println("The message is $msg") // use \ \ to include quotation mark \"$msg\"
}

//no return | with Two parameter
fun displayNameAndAge(name: String,age: Int) {
    println("Your name is $name")
    println("your age is $age")

}


//*********** (comments ) ************************
//
//    displayMessage("")
//    displayNameAndAge("",Int)
//
//println("Enter number 1:")
//    var number : Int = readln().toInt()
//
//    println("The cube is ${number * number * number}")
//
//    println("Enter number 2:")
//    var number2: Int = readln().toInt()
//
//    println("The cube is ${number2 * number2 * number2}")

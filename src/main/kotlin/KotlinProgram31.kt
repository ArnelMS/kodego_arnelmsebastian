fun main() {
    try {
        println("Enter number 1: ")
        var num1: Int = readln().toInt()
    } catch (e: Exception) {
        (e.message)
        println("Invalid input! Digits Only!")
    }
}

//Exception
//- soumething that disrupts a normal flow of your code
//recoverable - you can handle exceptions

//Error
// unrecoverable - ex. low Ram / Blue screen

// try - catch block
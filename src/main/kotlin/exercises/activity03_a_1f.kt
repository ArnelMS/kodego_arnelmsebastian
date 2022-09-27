import java.lang.Exception

fun main() {
//Activity 03-A => Activity 01-E
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F

    try {
        println("Please enter a word:")
        var string1: String = readln().toString()
            println("Your word is:")
            println(string1)

            // Reversed
            println()
            println("If word is reversed:")
            println(string1.reversed().toString())

            // Reversed
            var length: Int = string1.length
            println("Word length is $length")

            // Condition
            println()
            if (string1 == string1.reversed().toString()) {
                println("Your word is PALINDROME")
            } else if (string1 != string1.reversed())
                println("Your word is NOT a Palindrone")
        } catch (e: Exception) {
            println("Please enter a valid word!")
        }
    println("Thank You")
}

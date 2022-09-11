fun main() {

//Activity 01 - F
//Create an application that will accept 1 string. Your application will print “Palindrome” if the string is a palindrome.
    println("Please enter a word:")
    var string1: String = "dennis sinned"
    println("Your word is:")
    println(string1)

    // Reversed
    println()
    println("If word is reversed:")
    println(string1.reversed())

    // Reversed
    var length: Int = string1.length
    println("Word length is $length")

    // Condition
    println()
    if (string1 == string1.reversed()){
                println("Your word is PALINDROME")
    }else if(string1 != string1.reversed())
        println("Your word is NOT a Palindrone")

    println("Thank You")


}
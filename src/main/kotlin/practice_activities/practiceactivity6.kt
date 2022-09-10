import java.util.InputMismatchException

//Practice Activity - Activity-01 F
//improvement (Palindrone problem)

fun main(){

    println("Enter String: ")
    var string1 : String = readln()
    palindroneChecker(string1)
}

fun palindroneChecker(string1: String){
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

println("Thank You")}
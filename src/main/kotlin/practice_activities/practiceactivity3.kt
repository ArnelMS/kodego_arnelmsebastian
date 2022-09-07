import kotlin.math.E

fun main() {
// Practice Activity 3 - AGE GROUP
// Design program AgeGroup that will determine if age belongs to underage, young adult, adult, senior.
// Under age is 1-17; young adult is from 18-30; adult is from 31-59; senior is from 60 or more.
// Display “Invalid age” for negative numbers.


    print("Enter Age:")
    var age : Int = readln().toInt()

    if ((age >= 1) && (age <= 17)) {
        println("Underage")
    } else if ((age >= 18) && (age <= 30)) {
        println("Young Adult")
    } else if ((age >= 31) && (age <= 59)) {
        println("Adult")
    } else if (age >= 60) {
        println("Senior")
    } else {
        println("Invalid Age")

    }
    println()
    println()
    println("Line Ends Here")
}

package practice_activities

fun main() {

    println("Enter Grade in Math:")
    var math: Float = readln().toFloat()

    println("$math")

    println("Enter Grade in English:")
    var english: Float = readln().toFloat()

    println("$english")

    println("Enter Grade in Filipino:")
    var filipino: Float = readln().toFloat()

    println("$filipino")

    print("Average Grade is:")
    var average: Float = (math + english + filipino)/3

    print (average)
}
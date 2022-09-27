import java.lang.Exception

//Activity 03-A => Activity 01-D
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F

fun main() {
    var amount: Double = 0.00
    var condition: Boolean = true

    try {
        print("Please Enter amount: ")
        amount = readln().toDouble()

        while (condition) {
            print("Do you want to add another amount? ")
            var answer: String = readln().uppercase()

            if (answer == "YES") {
                print("Enter new amount: ")
                var newamount: Double = readln().toDouble()
                amount = amount + newamount

                println("Sub-total is $amount")
                println()

            } else if (answer != "NO") {
                println("Please answer with YES or NO only")
                println()

            } else if (answer == "NO") {
                print("Sub-total is $amount")
                println()

                println("Divide by how many? ")
                var divisor: Int = readln().toInt()

                var total: Double = amount / divisor
                println("Total :  $total")


                println()
                println("Thank you & Have a great day!!!")
                break
            }

        }
    } catch (e: Exception) {
        println("Please enter a valid amount!")

    }
}
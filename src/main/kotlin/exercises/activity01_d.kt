fun main() {

//Activity 01 - D
//Create an application that will accept monetary amounts.
// The application will continue to accept values until a “No” is set as input for the question
// “Do you want to add another amount?”.

//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the first input will be divided by the second input.

    print("Please Enter amount: ")
    var amount: Int = readln().toInt()
    var condition: Boolean = true

    while (condition){
        print("Do you want to add another amount? ")
        var answer: String = readln().uppercase()

        if (answer == "YES") {
            print("Enter new amount: ")
            var newamount: Int = readln().toInt()
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

            var total: Int = amount / divisor
            println("Total :  $total")


            println()
            println("Thank you & Have a great day!!!")
            break
        }
    }

}
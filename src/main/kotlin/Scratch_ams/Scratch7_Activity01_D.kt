fun main() {

//Activity 01 - D
//Create an application that will accept monetary amounts.
// The application will continue to accept values until a “No” is set as input for the question
// “Do you want to add another amount?”.

//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the first input will be divided by the second input.

    //ENTER AMOUNT
    print("Please enter amount: ")
    var amount: Int = readln().toInt()
    var answer: String = "YES"

    while (answer == "YES") {

        //ADD NEW AMOUNT?
        print("Do you want to add another amount?")
        answer = readln().uppercase()
        // YES OR NO
        if (answer == "YES" || answer == "yes") {
            print("Enter new amount: ")
            var newamount: Int = readln().toInt()
            amount = amount + newamount

        } else if (answer != "No" || answer != "no") {
            println("Total amount is: $amount")

            print("Divide by how many? ")
            var divisor: Int = readln().toInt()

            var total: Int = amount / divisor
            println("Total :  $total")

            println()
            println("Thank you")}
    }
}
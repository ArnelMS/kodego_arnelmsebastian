import java.security.KeyStore.TrustedCertificateEntry
import javax.swing.text.StyledEditorKit.BoldAction

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
    var answer: String = "yes"

    while (answer == "yes") {

        //ADD NEW AMOUNT?
        print("Do you want to add another amount?")
        answer = readln()
        // YES OR NO
        if (answer == "Yes" || answer == "yes") {
            print("Enter new amount: ")
            var newamount: Int = readln().toInt()
            amount = amount + newamount
        }
    }
    println("Total amount is: $amount")

    print("Divide by how many? ")
    var divisor: Int = readln().toInt()

    var total: Int = amount / divisor
    println("Total :  $total")

    println()
    println("Thank you")
}

// WORKING -----------------------
//        }
//        //IF YES
//        if (answer != "No" && answer != "no") {
//            for (New in 1..5) {
//                print("Enter new amount: ")
//                var newamount: Int = readln().toInt()
//                amount = amount + newamount
//                println("Do you want to add another amount?")
//                var answer: String = readln().toString()
//                var condition: Boolean = false
//            }
//


//
//            // ----------------------------------------------------------------
//            var yes: Any = "Yes"
//            var no: Any = "No"
//
//            var ctr: Int = readln().toInt()
//
//            //condition
//            while (ctr <= 5) {
//                if (ctr == 3)
//                    println("Hello World! $ctr")
//                //update
//                ctr++
//
//                for (New in 1..5) {
//                    print("Enter new amount: ")
//                    var newamount: Int = readln().toInt()
//                    amount = amount + newamount
//
//                }
//                println("Total amount is: $amount")
//
//                println("Divide by how many?")
//                var divisor: Int = readln().toInt()
//
//                println(amount / divisor)
//
//                println()
//            }
//        }
//    }
//}
//

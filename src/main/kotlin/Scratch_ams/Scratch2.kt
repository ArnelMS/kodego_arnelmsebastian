fun main() {
//Activity 01 - E
//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

    print("Please enter first word: ")
    var string1: String = readln().uppercase()
    var string1length = string1.length

        var ctr1: Int = 0
        while (ctr1 <= string1length - 1) {
            println(string1[ctr1])

            ctr1++
        }

    print("Please enter second word: ")
    var string2: String = readln().uppercase()
    var string2length = string2.length

        var ctr2: Int = 0
        while (ctr2 <= string2length - 1) {
            println(string2[ctr2])

            ctr2++


        }

        println()
        println("Your words are $string1 & $string2")
        println("---Line ends here---")

    }

// *** FUNCTIONS ***


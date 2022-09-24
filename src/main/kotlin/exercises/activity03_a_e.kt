fun main() {
//Activity 03-A => Activity 01-E
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
        var firstWord = mutableListOf<Char>()
        var secondWord = mutableListOf<Char>()

        try {
                println("Please enter first word: ")
                var string1: String = readln().toString().uppercase()
                var string1length = string1.length

                var ctr1: Int = 0
                while (ctr1 <= string1length - 1) {
                        firstWord.add(string1[ctr1])
                        print(string1[ctr1])

                        ctr1++
                       }
        }catch (e:Exception){
                println("Please enter a valid word")
        }

        try {
                println()
                println("Please enter second word: ")
                var string2: String = readln().toString().uppercase()
                var string2length = string2.length

                var ctr2: Int = 0
                while (ctr2 <= string2length - 1) {
                        secondWord.add(string2[ctr2])
                        print(string2[ctr2])

                        ctr2++
                }
        }catch (e:Exception){
                println("Please enter a valid word")
        }

        println()
        println("**************************************************")
        println("Your words are $firstWord & $secondWord")
        println()
        println("Unique characters found are the following:")
        println("First Word")
        println(firstWord subtract secondWord)
                if(firstWord subtract secondWord != secondWord subtract firstWord){

                }else {
                        println("- No Unique Characters found! -")
                }
        println("Second Word")
        println(secondWord subtract firstWord)
                if(firstWord subtract secondWord != secondWord subtract firstWord){

                }else {
                        println("- No Unique Characters found! -")
                }
        println("**************************************************")

        println("---Line ends here---")

}
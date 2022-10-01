fun main() {
    // Can also be used as String
    var numbers = mutableListOf<Int>()

    var ctr : Int = 0
    while (ctr < 5) {
        print("Enter number ${ctr +1}:")
        var input = readln().toInt()
        numbers.add(input)

        ctr++
    }
    // display mutable list
    println("Displaying List")
    for (value in numbers){
        print(value)
    }
    println()
    println("*************************************")
    var word: String = "hello"
    println(word)
    var wordSet = mutableSetOf<Char>()
    for (letter in word) {
        for (letter2 in word) {
            if (letter == letter2) {

            }
        }
    }
}

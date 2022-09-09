fun main() {
    var string1: String = "This is My String"
    var string2: String = "This is My String too!"
    //string character
    println(string1[0])
    println("***********************************")
    //string length
    println(string1.length)
    println(string2.length)

    println("***********************************")
    //string equality
    println()
    println(string1 == string2)

    println("***********************************")
    //string uppercase/lowercase
    println(string2.uppercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    println()

    println("***********************************")
    //startswith
    println(string2.startsWith("tha"))
    //endswith
    println(string2.endsWith("too!"))

    println("***********************************")
    //concatenate
    println(string1 + " " + string2)
    println()
    //substring
    println(string1.substring(11, 14))

    println()
    //replace
    println(string1.replace("This","That"))
}

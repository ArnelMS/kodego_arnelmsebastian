fun main() {
    var string1: String = "This is My String"
    var string2: String = "This is My String too!"
    //string character
    println(string1[11])
    //string length
    println(string1.length)
    println(string2.length)
    //string equality
    println()
    println(string1 == string2)
    //string uppercase/lowercase
    println(string2.uppercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    println()
    //startswith
    println(string2.startsWith("tha"))
    //endswith
    println(string2.endsWith("too!"))
    //concatenate
    println(string1 + " " + string2)
    println()
    //substring
    println(string1.substring(11, 14))

    println()
    //replace
    println(string1.replace("This","That"))
}

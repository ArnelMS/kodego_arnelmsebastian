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

    var mySet2 = mutableSetOf<String>()
        mySet2.add (MyGenericClass(string1[ctr1]).toString())

    println(mySet2)
//    mySet2.add("Word 2")
//    mySet2.add("Word 3")
//    mySet2.add("Word 4")


//    var duplicate("$string1[ctr1]) == (string2[ctr2]){
//    }
//    if (string1[ctr1]) == (string2[ctr2]){
//        println("Same word")
//    }else if(string1[ctr1]) == (string2[ctr2])
//        println(duplicate)
//}

}
//
//    var combine:

//    var combined: (string1[ctr1] + " "+string2[ctr2])){
//        var duplicates: String = (combined)
//
//        println(duplicates)

//    var mySet2 = mutableSetOf<String>()
//    mySet2.addAll()
//    mySet2.add(7)
//    mySet2.add(8)
//    mySet2.add(8)
//    mySet2.remove(8)
//
//    for (data in mySet2) {
//        print(data)


//    println()
//    println("Your words are $string1 & $string2")



//generics
//class MyGenericClass<T>(value : T) {
//    init {
//        println(value.toString())

fun main() {

    var string1: String = "Dennis and Edna sinned"
    println("Your word is: $string1")
    var length: Int = string1.length
    println(length)

    do {
        for (reverse in 0..string1.length)
            print(string1[string1.length - 1])
        length-- //update
//        if (string1.length < length) {
//        } else if (string1.length - 1)

    }while (length >= string1.length)


//    for (letters in 'B'..'X'){
//        println(letters)
//    }
}
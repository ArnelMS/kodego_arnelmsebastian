fun main(){
    // imlipicit declaration
    //array size = 3 (number of elements)
    //index                0      1      2
    var names = arrayOf("John","Paul","Mark")
    println(names[0])

    //explicit (touch-move on elements)
    var numbers = arrayOf<Int>(2, 3, 10, 12, 9)
    println(numbers[4])

    //array size
    println(numbers.size)

    println("*******************")
    println(names[0])
    println(names[1])
    println(names[2])

    println("*******************")
    names[1] = "Matthew"
    //OR names.set(11, "Matthew"}

    println(names[0])
    //OR println(names.get(0))
    println(names[1])
    println(names[2])

}
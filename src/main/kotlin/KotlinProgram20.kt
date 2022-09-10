fun main(){
    // Can also be used as String
    var numbers = mutableListOf<Int>()

    var ctr : Int = 0
    while (ctr < 20) {
        print("Enter number ${ctr +1}:")
        var input = readln().toInt()
        numbers.add(input)

        ctr++
    }
    // display mutable list
    println("Displaying List")
    for (value in numbers){
        println(value)
    }
}
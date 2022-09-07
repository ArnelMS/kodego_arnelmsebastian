fun main(){

    var num1 : Int = 1
    var condition: Boolean = true

    while(condition) {
        print("Enter number: ")
        var input: Int = readln().toInt()
        num1 = num1 + input
    }
    println(num1)
}
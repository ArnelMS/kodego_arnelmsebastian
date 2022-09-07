fun main(){

    var num1 : Int = 0
    var condition: Boolean = true

    for(number in 1..5){
        print("Enter number:  ")
        var input: Int = readln().toInt()
        num1 = num1 + input
    }
    println(num1)
}
fun main(){

        var result: Int = cube(2)
        println(result)

        println(add(5,2))



//with return, One parameter
fun cube(number:Int):Int{
        return number + number + number

}

//with return, Two parameter
fun add(number1: Int, number2: Int):Int {
        println("Welcome to the add function!")
        return number1 + number2
}
}















//        var names = ArrayList<Int>()
//
//        //ADD ELEMENTS
//        names.add(1) // index 0
//        names.add(2) // index 1
//
//        //DISPLAY NAMES[0]
//        println(names[0])
//        println(names[1])
//
//        //REMOVE ELEMENTS
//        names.removeAt(0)//Peter move to -> index 0
//
//        //DISPLAY NAMES[0]
//        println("***********************************")
//        println(names[0])
//
//
//
//
//}
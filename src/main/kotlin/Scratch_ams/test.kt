fun main(){
    // Can also be used as String
    var studentdetailsencode = mutableListOf<String>()

    var ctr : Int = 0
    while (ctr < 5) {
        print("Enter Student Details ${ctr +1}:")
        var input: StudentDetails(test)
        studentdetailsencode.add(input)

        ctr++
    }
    // display mutable list
    println("Displaying List")
    for (value in numbers){
        print(value)
    }
}



























//fun main() {
//    var names = ArrayList<String>()
//    //ADD ELEMENTS
//    names.add("John") // index 0
//    names.add("Peter") // index 1
//
//    println(names)
//
//}
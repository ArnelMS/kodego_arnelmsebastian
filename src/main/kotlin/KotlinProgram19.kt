fun main(){
    // Index base
    var mylist = listOf(2,5,3,1) // read only | immutable
    var myList2 = mutableListOf<Int>() //mutable
    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10

    for (myList2Value in myList2){
        println(myList2Value)
    }
    println()
    println("******************************************")
    println()

    // get 2nd element
    println(mylist[1])

    // display size
    println(mylist.size)

    println()
    println("******************************************")
    println()

    //traverse list
    for (listValue in mylist){
        println(listValue)
    }

}
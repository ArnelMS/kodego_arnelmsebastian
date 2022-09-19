fun main(){
    // Index base
    var mylist = listOf(2,5,3,1) // read only | immutable

    var myList2 = mutableListOf<String>() //mutable
    myList2.add("Apple")
    myList2.add("Avocado")
    myList2.add("Orange")

    myList2[2] = "Banana" // Replace String ony listOf

    for (myList2Value in myList2){
        println(myList2Value)
    }
    println("******************************************")


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
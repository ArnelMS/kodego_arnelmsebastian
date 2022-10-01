fun main(){
    var names = ArrayList<String>()
    //ADD ELEMENTS
    names.add("John") // index 0
    names.add("Peter") // index 1

    //DISPLAY NAMES[0]
    println(names[0])
    println(names[1])

    //REMOVE ELEMENTS
    names.removeAt(0)//Peter will be moved to -> index 0

    //DISPLAY NAMES[0]
    println("***********************************")
    println(names[0])




}
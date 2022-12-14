fun main(){
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")

    println(map)
    println(map.size)
    println(map.count()+1)
    //getting value from map
    println(map[1])
    println(map.get(2))

    //traversing keys
    for (key in map.keys) {
        print(key)
    }
    println()
    //traversing values
    for (value in map.keys){
        print(value)
    }
    println(    )
    println("*************************************************")

    //mutable mapOf
    println()
    var map2 = mutableMapOf<Int,String>()
    map2.put(2, "John")
//    map2.remove(2)
    println(map2)

//    a -> readline
//    b -> readline
}
fun main(){

    var student1 = mutableMapOf<Int, String>()
    var student2 = mutableMapOf<Int, String>()
    var student3 = mutableMapOf<Int, String>()
    var student4 = mutableMapOf<Int, String>()


//    var student2 = mutableMapOf<String,Double,Int>(1 to "Karen Smith", 2 to 85%, 3 to 25/30)
//    var student3 = mutableMapOf<String,Double,Int>(1 to "Juan Dela Cruz", 2 to 89%, 3 to 28/30)
//    var student4 = mutableMapOf<String,Double,Int>(1 to "Juan Dela Cruz", 2 to 91%, 3 to 29/30)


    student1.put (1,"Pepito Manaloto")
    student1.put (2,"Karen Smith")
    student1.put (3,"Marites Aksaya")
    student1.put (4,"Juan Dela Cruz")
//    student1.put (2 to 85)
//    student1.put (3 to 25/30)

    println("$student1")
    println("Please choose Student")
    print(student1[readln().toInt()])
}
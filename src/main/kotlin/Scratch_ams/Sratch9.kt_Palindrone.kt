//Using Activity 01 - B and Implement a process where someone can borrow a book.
fun main(){

    print("Enter FirstName:  ")
    var firstName : String = readln().toString().uppercase()
    print("Enter LastName:  ")
    var lastName : String = readln().toString().uppercase()

    print("Enter Mobile#:  ")
    var mobile : String = readln()

    print("Enter Email:  ")
    var email : String = readln().toString()

    print("Enter Student#:  ")
    var studentNumber : Int = readln().toInt()

    println("********************************")
    println("Name:      $firstName $lastName")
    println("Mobile:    $mobile")
    println("Email:     $email")
    println("Student#:  $studentNumber")
    println("********************************")



}
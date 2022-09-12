fun main() {
//Activity 01 - H
// Using Activity 01 - B and Implement a process where someone can borrow a book.
    var studentsList = ArrayList<String>()
    var student_borrow = ArrayList<String>()
    var booklists = ArrayList<String>()
    var menu: String = "| OPTIONS |"
    var option1: String = "[1] Student List"
    var option2: String = "[2] New student"
    var option3: String = "[3] List of books"
    var option4: String = "[4] Borrow a book"
    var option5: String = "[5] Return a book"
    var option6: String = "[6] Exit"

    println("| OPTIONS |")
    println("[1] Student List")
    println("[2] New student")
    println("[3] List of books")
    println("[4] Borrow a book")
    println("[5] Return a book")
    println("[6] Exit")
    print("Select Options: ")
    var options: Int = readln().toInt()
//    var alloptions: String = ("$menu $option1 $option2 $option3 $option4 $option5 $option6 $options")
    {
        var counter: Int = 0
        do {

            //options
            if (options.toInt() == 1) {
                println("[1] Student List")
                println("$studentsList")

            } else if (options.toInt() == 2) {
                println("[2] New student")
                println("Please Complete Details")

                print("Enter Firstname  : ")
                var firstName = readln().toString()
                print("Enter Lastname   : ")
                var lastName = readln().toString()
                print("Enter Mobile#    : ")
                var mobile = readln().toString()
                print("Enter Email      : ")
                var email = readln().toString()

                studentsList.add("$firstName $lastName | $mobile  |  $email")


            } else if (options.toInt() == 3) {
                println("[3] List of books")
                println(booklists)


            } else if (options.toInt() == 4) {
                println("[4] Borrow a book")
                println("Enter Firstname  : ")
                var firstName = readln().toString()
                println("Enter Lastname   : ")
                var lastName = readln().toString()
                println("Book Title       : ")
                var booktitle = readln().toString()
                println("Date Borrowed    : ")
                var dateborrowed = readln().toString()

                student_borrow.add("$firstName $lastName    |  $booktitle   |   $dateborrowed")
                println(student_borrow)


            } else if (options.toInt() == 5) {
                println("[5] Return a book")
                println("Enter Firstname  : ")
                var firstName = readln().toString()
                println("Enter Lastname   : ")
                var lastName = readln().toString()
                println("Book Title       : ")
                var booktitle = readln().toString()
                println("Date Borrowed    : ")
                var dateborrowed = readln().toString()

                student_borrow.remove("$firstName $lastName |   $booktitle    |   $dateborrowed")
                println(student_borrow)

            } else if (options.toInt() == 6) {
                println("~ Thank You ~")

                counter++
            } while (counter <= 100) {
            }
        }
    }
}
//    } else if (options.toInt() != 0) {
//        var counter: Int = 0
//        while (counter < 5) {
//            println("Enter Options: $options")

//        }
//                    //Display new array values'
//                var ctr2: Int = 0
//                while (ctr2 < studentsList.size) {
//                println(studentsList[ctr2])
//
//                ctr2++

//        println(studentsList)


// BOOK DETAILS
//
//        print("Enter Book Title : Book1")
//        var bookTitle = readln().toString()
//        print("Enter Categoory  : Magic")
//        var bookCategory = readln().toString()
//        print("Enter Book Code  : 123456789")
//        var bookCode = readln().toString()
//
//        booklists.add("$bookTitle  |  $bookCategory  |  $bookCode")
//        println(booklists)
//    }



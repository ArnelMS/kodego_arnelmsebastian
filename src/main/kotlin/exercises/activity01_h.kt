import java.security.KeyStore.TrustedCertificateEntry

fun main() {
//Activity 01 - H
// Using Activity 01 - B and Implement a process where someone can borrow a book.
    var studentsList = ArrayList<String>()
    var student_borrow = ArrayList<String>()
    var booklists = ArrayList<String>()

//    booklists.add("\nBook Title:   Harry Potter\nCategory:     Fantasy\nBookCode:     2022001\n_____________________________")
//    booklists.add("\nBook Title:   Math 101\nCategory:     Mathematics\nBookCode:     2022002\n_____________________________")
//    booklists.add("\nBook Title:   ABC\nCategory:     Children\nBookCode:     2022003\n_____________________________")
//    booklists.add("\nBook Title:   English 101\nCategory:     English\nBookCode:     2022004\n_____________________________")

    var ctr: Int = 0
    do {
        println()
        println("********* OPTIONS *********")
        println("[1] Student List")
        println("[2] New student")
        println("[3] List of books")
        println("[4] Add a book")
        println("[5] Borrow a book")
        println("[6] Return a book")
        println("[7] Exit")
        println("****************************")
        print("Select Options: ")
        var options: Int = readln().toInt()

        //    var alloptions: String = ("$menu $option1 $option2 $option3 $option4 $option5 $option6 $options")
        //    println("~ Thank you ~")

        //options
        var ctr2: Int = 0
        do {
            if (options.toInt() == 1){
                println("*** Student List ***")
                println(studentsList)
                println(student_borrow)
                break
                ctr2++

            }else if (options.toInt() == 2){
                println("*** New student ***")
                println("Please Complete Details")

                print("Enter Firstname  : ")
                var firstName = readln().toString()
                print("Enter Lastname   : ")
                var lastName = readln().toString()
                print("Enter Mobile#    : ")
                var mobile = readln().toString()
                print("Enter Email      : ")
                var email = readln().toString()

                studentsList.add("\nName:       $firstName $lastName\nMobile #: $mobile\nEmail:     $email\n_____________________________")
                break
                ctr2++

            } else if (options.toInt() == 3) {
                println("*** List of books ***")
                println(booklists)
                break
                ctr2++

            } else if (options.toInt() == 4) {
                // BOOK DETAILS
                print("Enter Book Title : ")
                var bookTitle = readln().toString()
                print("Enter Categoory  : ")
                var bookCategory = readln().toString()
                print("Enter Book Code  : ")
                var bookCode = readln().toString()

                booklists.add("\nBook Title:    $bookTitle\nCategory:   $bookCategory\nBookCode:    $bookCode\n_____________________________")
                println(booklists)

                break
                ctr2++

                // BORROW A BOOK
            } else if (options.toInt() == 5) {
                println("*** Borrow a book ***")
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
                break
                ctr2++

                // RETURN A BOOK
            } else if (options.toInt() == 6) {
                println("*** Return a book ***")
                println("Enter Firstname  : ")
                var firstName = readln().toString()
                println("Enter Lastname   : ")
                var lastName = readln().toString()
                println("Book Title       : ")
                var booktitle = readln().toString()
                println("Date Returned    : ")
                var dateborrowed = readln().toString()

                student_borrow.remove("$firstName $lastName    |  $booktitle   |   $dateborrowed")
                student_borrow.add("$booktitle")
//                        student_borrow.remove("$firstName $lastName |   $booktitle    |   $dateborrowed")
                println(student_borrow)
                break
                ctr2++

            } else if (options.toInt() == 7)
                break

                ctr2++
        }while (ctr2 <= 50)

        ctr++
    }while (ctr <= 50)
}

//fun bookstocks(){
//    booklists.add("Harry Potter, Fantasy")



//    var menu: String = "| OPTIONS |"
//    var option1: String = "[1] Student List"
//    var option2: String = "[2] New student"
//    var option3: String = "[3] List of books"
//    var option4: String = "[4] Borrow a book"
//    var option5: String = "[5] Return a book"
//    var option6: String = "[6] Exit"
////

////    //
////    //        booklists.add("$bookTitle  |  $bookCategory  |  $bookCode")
////    //        println(booklists)
////    //    }
////
////

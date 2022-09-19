fun main(){

    var myLibrary = BookList("Harry Potter", "Fantasy")


//    println("$BookList")


}


// Class
class BookList (var bookTitle:String, var category:String) {

    init {
        println ("********* OPTIONS *********")
        println("[1] Student List")
        println("[2] New student")
        println("[3] List of books")
        println("[4] Add a book")
        println("[5] Borrow a book")
        println("[6] Return a book")
        println("[7] Exit")
        println("****************************")
        print("Select Options: ")
    }


}
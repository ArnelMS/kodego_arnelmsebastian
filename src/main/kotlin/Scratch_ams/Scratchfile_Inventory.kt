package exercises

fun main() {

    var myList2 = mutableListOf<String>() //mutable
    var index0 = mutableListOf(myList2[0])

    myList2.add("Apple")
    myList2.add("Avocado")
    myList2.add("Orange")
    myList2.add("Banana")
    myList2.add("Kiwi")



    do {
        println("------MENU------")
        println("[1] List of Items")
        println("[2] Add New Item")
        println("[3] Remove Item")
        println("[4] Check Availability")
        println("[5] Exit")
        println()
        print("Enter Option: ")
        var itemnumber: Int = readln().toInt()
        var counter: Int = itemnumber

        do {
            if (itemnumber == 1) {
                println("- Available Items -")
                for (myList2Value in myList2)
                    println(myList2Value)
                break
                counter++

            } else if(itemnumber == 2) {
                println("Please enter new item")
                var addItem: String = readln().toString()
                println("You added $addItem to the Item List")
                myList2.add("$addItem")
                break
                counter++

            } else if (itemnumber == 3) {
                println("Please enter new item")
                var removeItem: String = readln().toString()
                println("You removed $removeItem to the Item List")
                myList2.remove("$removeItem")

                break
                counter++

            } else if (itemnumber == 4) {
                println("Please enter item to check stocks")
                println(index0)
                var removeItem: String = readln().toString()
                println("You removed $removeItem to the Item List")
                myList2.remove("$removeItem")

                break
                counter++

            } else if (itemnumber.toInt() == 5){
                println("Thank you")
                counter++
            }


        }while (counter <= 5)

    }while (counter <= 5)
}


//        when (itemnumber) {
//            1 -> println("List of Items: ")
//            2 -> println("Replace Item")
//            3 -> println("Add New Item")
//            4 -> println("Sold item(s)")
//            else -> println("invalid item number")
//************************************************************************

//    var mylist = listOf(2, 5, 3, 1) // read only | immutable



//    myList2[2] = "Banana" // Replace String ony listOf



//************************************************************************
//
//        println("Enter item:")
//
//        var itemName: String = readln()
//        println("Item Name: $itemName")
//
//        var item1: String = "Apple"
//        var type1: String = "Fruits"
//        var price1: Double = 50.00
//        var quantity1: Int = 10
//        var available1: Char = 'Y'
//
//        var item2: String = "Toothpaste"
//        var type2: String = "Toiletries"
//        var price2: Double = 100.00
//        var quantity2: Int = 5
//        var available2: Char = 'Y'
//
//        var item3: String = "Pork Chop"
//        var type3: String = "Meat/Fish"
//        var price3: Double = 300.00
//        var quantity3: Int = 10
//        var available3: Char = 'Y'
//
//        var item4: String = "Baygon"
//        var type4: String = "Non-Food"
//        var price4: Double = 180.00
//        var quantity4: Int = 3
//        var available4: Char = 'Y'
//
//        var item5: String = "Lettuce"
//        var type5: String = "Vegetables"
//        var price5: Double = 50.00
//        var quantity5: Int = 10
//        var available5: Char = 'Y'
//
//        if (itemName == item1) {
//            println("Item:      $item1")
//            println("Type:      $type1")
//            println("Price:     $price1")
//            println("Quantity:  $quantity1")
//            println("Available: $available1")
//        }
//
//        if (itemName == item2) {
//            println("Item:      $item2")
//            println("Type:      $type2")
//            println("Price:     $price2")
//            println("Quantity:  $quantity2")
//            println("Available: $available2")
//        }
//
//        if (itemName == item3) {
//            println("Item:      $item3")
//            println("Type:      $type3")
//            println("Price:     $price3")
//            println("Quantity:  $quantity3")
//            println("Available: $available3")
//        }
//
//        if (itemName == item4) {
//            println("Item:      $item4")
//            println("Type:      $type4")
//            println("Price:     $price4")
//            println("Quantity:  $quantity4")
//            println("Available: $available4")
//        }
//
//        if (itemName == item5) {
//            println("Item:      $item5")
//            println("Type:      $type5")
//            println("Price:     $price5")
//            println("Quantity:  $quantity5")
//            println("Available: $available5")
//        }
//
//        if (itemName == "list") {
//            println("Available Items:")
//            println("Item 1.     $item1")
//            println("Item 2.     $item2")
//            println("Item 3.     $item3")
//            println("Item 4.     $item4")
//            println("Item 5.     $item5")
//        }
//    }
//}
////    println(Grocery1)
////    println(Grocery2)
////    println(Grocery3)
////    println(Grocery4)
////    println(Grocery5)
////    println(Grocery6)
////    println(Grocery7)
////    println(Grocery8)
//
//
////
////fun main() {
//////Activity 01 - F
////// Using Activity 01 - C and implement a process where items are added to the grocery.
////        var groceryItems = ArrayList<String>()
////        var student_borrow = ArrayList<String>()
////        var booklists = ArrayList<String>()
////
////        println("| OPTIONS |")
////        println("[1] Add Item")
////        println("[2] New student")
////        println("[3] List of books")
////        println("[4] Borrow a book")
////        println("[5] Return a book")
////        println("[6] Exit")
////        print("Select Options: ")
////        var options: Int = readln().toInt()
////
////        //options
////        if (options.toInt() == 1) {
////            println("[1] Student List")
////            println("$studentsList")
////
////        } else if (options.toInt() == 2) {
////            println("[2] New student")
////            println("Please Complete Details")
////
////            print("Enter Firstname  : ")
////            var firstName = readln().toString()
////            print("Enter Lastname   : ")
////            var lastName = readln().toString()
////            print("Enter Mobile#    : ")
////            var mobile = readln().toString()
////            print("Enter Email      : ")
////            var email = readln().toString()
////
////            studentsList.add("$firstName $lastName | $mobile  |  $email")
////
////
////        } else if (options.toInt() == 3) {
////            println("[3] List of books")
////            println(booklists)
////
////
////        } else if (options.toInt() == 4) {
////            println("[4] Borrow a book")
////            println("Enter Firstname  : ")
////            var firstName = readln().toString()
////            println("Enter Lastname   : ")
////            var lastName = readln().toString()
////            println("Book Title       : ")
////            var booktitle = readln().toString()
////            println("Date Borrowed    : ")
////            var dateborrowed = readln().toString()
////
////            student_borrow.add("$firstName $lastName    |  $booktitle   |   $dateborrowed")
////            println(student_borrow)
////
////
////        } else if (options.toInt() == 5) {
////            println("[5] Return a book")
////            println("Enter Firstname  : ")
////            var firstName = readln().toString()
////            println("Enter Lastname   : ")
////            var lastName = readln().toString()
////            println("Book Title       : ")
////            var booktitle = readln().toString()
////            println("Date Borrowed    : ")
////            var dateborrowed = readln().toString()
////
////            student_borrow.remove("$firstName $lastName |   $booktitle    |   $dateborrowed")
////            println(student_borrow)
////
////        } else if (options.toInt() == 6) {
////            println("~ Thank You ~")
////
////        }
////    }
////
////
////    println("Enter item:")()
////
////    var itemName: String = readln()
////    println("Item Name: $itemName")
////
////    var item1: String = "Apple"
////    var type1: String = "Fruits"
////    var price1: Double = 50.00
////    var quantity1: Int = 10
////    var available1: Char = 'Y'
////
////    var item2: String = "Toothpaste"
////    var type2: String = "Toiletries"
////    var price2: Double = 100.00
////    var quantity2: Int = 5
////    var available2: Char = 'Y'
////
////    var item3: String = "Pork Chop"
////    var type3: String = "Meat/Fish"
////    var price3: Double = 300.00
////    var quantity3: Int = 10
////    var available3: Char = 'Y'
////
////    var item4: String = "Baygon"
////    var type4: String = "Non-Food"
////    var price4: Double = 180.00
////    var quantity4: Int = 3
////    var available4: Char = 'Y'
////
////    var item5: String = "Lettuce"
////    var type5: String = "Vegetables"
////    var price5: Double = 50.00
////    var quantity5: Int = 10
////    var available5: Char = 'Y'
////
////    if (itemName == item1) {
////        println("Item:      $item1")
////        println("Type:      $type1")
////        println("Price:     $price1")
////        println("Quantity:  $quantity1")
////        println("Available: $available1")
////    }
////
////    if (itemName == item2) {
////        println("Item:      $item2")
////        println("Type:      $type2")
////        println("Price:     $price2")
////        println("Quantity:  $quantity2")
////        println("Available: $available2")
////    }
////
////    if (itemName == item3) {
////        println("Item:      $item3")
////        println("Type:      $type3")
////        println("Price:     $price3")
////        println("Quantity:  $quantity3")
////        println("Available: $available3")
////    }
////
////    if (itemName == item4) {
////        println("Item:      $item4")
////        println("Type:      $type4")
////        println("Price:     $price4")
////        println("Quantity:  $quantity4")
////        println("Available: $available4")
////    }
////
////    if (itemName == item5) {
////        println("Item:      $item5")
////        println("Type:      $type5")
////        println("Price:     $price5")
////        println("Quantity:  $quantity5")
////        println("Available: $available5")
////    }
////
////    if (itemName == "list") {
////        println("Available Items:")
////        println("Item 1.     $item1")
////        println("Item 2.     $item2")
////        println("Item 3.     $item3")
////        println("Item 4.     $item4")
////        println("Item 5.     $item5")
////    }
////}
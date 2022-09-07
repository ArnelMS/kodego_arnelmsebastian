package exercises

fun main() {
//Activity 01 - A
//You are tasked to automate a school’s library. Identify the items that can be borrowed in a Library.
// After listing the different items, identify the characteristics of the items. Use the proper data types.

    println("Enter item:")

    var itemName: String = readln()
    println("Item Name: $itemName")

    var item1: String = "Apple"
    var type1: String = "Fruits"
    var price1: Double = 50.00
    var quantity1: Int = 10
    var available1: Char = 'Y'

    var item2: String = "Toothpaste"
    var type2: String = "Toiletries"
    var price2: Double = 100.00
    var quantity2: Int = 5
    var available2: Char = 'Y'

    var item3: String = "Pork Chop"
    var type3: String = "Meat/Fish"
    var price3: Double = 300.00
    var quantity3: Int = 10
    var available3: Char = 'Y'

    var item4: String = "Baygon"
    var type4: String = "Non-Food"
    var price4: Double = 180.00
    var quantity4: Int = 3
    var available4: Char = 'Y'

    var item5: String = "Lettuce"
    var type5: String = "Vegetables"
    var price5: Double = 50.00
    var quantity5: Int = 10
    var available5: Char = 'Y'

    if (itemName == item1) {
        println("Item:      $item1")
        println("Type:      $type1")
        println("Price:     $price1")
        println("Quantity:  $quantity1")
        println("Available: $available1")
    }

    if (itemName == item2) {
        println("Item:      $item2")
        println("Type:      $type2")
        println("Price:     $price2")
        println("Quantity:  $quantity2")
        println("Available: $available2")
    }

    if (itemName == item3) {
        println("Item:      $item3")
        println("Type:      $type3")
        println("Price:     $price3")
        println("Quantity:  $quantity3")
        println("Available: $available3")
    }

    if (itemName == item4) {
        println("Item:      $item4")
        println("Type:      $type4")
        println("Price:     $price4")
        println("Quantity:  $quantity4")
        println("Available: $available4")
    }

    if (itemName == item5) {
        println("Item:      $item5")
        println("Type:      $type5")
        println("Price:     $price5")
        println("Quantity:  $quantity5")
        println("Available: $available5")
    }

    if (itemName == "list") {
        println("Available Items:")
        println("Item 1.     $item1")
        println("Item 2.     $item2")
        println("Item 3.     $item3")
        println("Item 4.     $item4")
        println("Item 5.     $item5")
    }
}
//    println(Grocery1)
//    println(Grocery2)
//    println(Grocery3)
//    println(Grocery4)
//    println(Grocery5)
//    println(Grocery6)
//    println(Grocery7)
//    println(Grocery8)

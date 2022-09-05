//Practice Activity 4 - PRICE & DISCOUNTS
fun main() {

    print("Enter Product: ")
    var product: String = readln().toString()
    println("$product")

    print("Enter Price: ")
    var price: Int = readln().toInt()
    print("$price")

    println()
    println("Price of $product is $price")

    print("Discount is ")
    var discount: String = "$price"

    if ((price >= 0) && (price <= 10000)) {
        println("0%")
    } else if ((price >= 10001) && (price <= 20000)) {
        println("5%")
    } else if ((price >= 20001) && (price <= 50000)) {
        println("10%")
    } else if ((price >= 50001) && (price <= 100000)) {
        println("15%")
    } else if ((price > 100000)) {
        println("20%")
    } else {
        println("Invalid Amount")
    }

    val netprice: Int = 1*1

    if ((price >= 0) && (price <= 10000)) {
        println("0%")
    } else if ((price >= 10001) && (price <= 20000)) {
        println("5%")
    } else if ((price >= 20001) && (price <= 50000)) {
        println("10%")
    } else if ((price >= 50001) && (price <= 100000)) {
        println("15%")
    } else if ((price > 100000)) {
        println("20%")
    } else {
        println("Invalid Amount")
    }
    println("Net Price is $netprice")


}

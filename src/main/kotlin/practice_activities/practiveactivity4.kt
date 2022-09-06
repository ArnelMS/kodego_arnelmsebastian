//Practice Activity 4 - PRICE & DISCOUNTS
fun main() {

    print("Enter Product: ")
    var product: String = readln().toString()
    println("$product")

    print("Enter Price: ")
    var price: Float = readln().toFloat()
    var price2: Float? = price as? Float
    print("$price")

    println()
    println("Price of $product is $price")

    print("Discount is ")

    var zero: Double = 0.00
    var five: Double = 0.05
    var ten: Double = 0.10
    var fifteen: Double = 0.15
    var twenty: Double = 0.20
    var subtotal1 : Double = price * zero
    var subtotal2 : Double = price * five
    var subtotal3 : Double = price * ten
    var subtotal4 : Double = price * fifteen
    var subtotal5 : Double = price * twenty

    if ((price >= 0) && (price <= 10000)) {
        println("$subtotal1")
    } else if ((price >= 10001) && (price <= 20000)) {
        println("$subtotal2")
    } else if ((price >= 20001) && (price <= 50000)) {
        println("$subtotal3")
    } else if ((price >= 50001) && (price <= 100000)) {
        println("$subtotal4")
    } else if ((price > 100000)) {
        println("$subtotal5")
    } else {
        println("Invalid Amount")
    }

//    if ((
//    println("Net Price is $netprice")
//
//    var netprice1 : Double = price - subtotal1
//    var netprice2 : Double = price * subtotal2
//    var netprice3 : Double = price * subtotal3
//    var netprice4 : Double = price * subtotal4
//    var netprice5 : Double = price * subtotal5


    //println (("$discount * $price"))


}

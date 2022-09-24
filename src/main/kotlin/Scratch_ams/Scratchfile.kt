fun main () {
    println("Please enter product name: ")
    var itemName: String = readln().toString()
    println("Please enter price: ")
    var price: Double = readln().toDouble()

    var checkDiscount = DiscountActivity(itemName,price)
    println(checkDiscount.getDiscountedCost(0.00))
}
//CLASS
class DiscountActivity(var itemName: String, var price:Double) {


    fun getDiscountedCost(price: Double):Double {

        var price = this.price
        var zeroDiscount: Double = 0.0
        var discount5: Double = 0.05
        var discount10: Double = 0.10
        var discount15: Double = 0.15
        var discount20: Double = 0.20


        if ((price >= 0.00) && (price <= 10000.99)) {
            println("No discount")
            return 0.0

        } else if ((price >= 10001.00) && (price <= 20000.99)) {
            var discount: Double = price * discount5
            var discount1: Double = price - discount
            println("your discount is $discount you will only pay $discount1")
            return discount

        } else if ((price >= 20001.00) && (price <= 50000.99)) {
            var discount: Double = price * discount10
            var discount1: Double = price - discount
            println("your discount is $discount you will only pay $discount1")
            return discount
        } else if ((price >= 50001.00) && (price <= 100000.99)) {
            var discount: Double = price * discount15
            var discount1: Double = price - discount
            println("your discount is $discount you will only pay $discount1")
            return discount
        } else if ((price >= 100001.99)) {
            var discount: Double = this.price * discount20
            var discount1: Double = price - discount
            println("your discount is $discount you will only pay $discount1")
            return discount
        }

        return 0.0
    }

}
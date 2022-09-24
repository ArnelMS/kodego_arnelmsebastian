fun main () {

    println("Please enter product name: ")
        var price: String = readln().toString()

    println("how much is the item")
        try {
            println()
            var price: Double = readln().toDouble()

            var price1: Double = 100.00
            var price2: Double = 5.00
            var price3: Double = 10.00
            var price4: Double = 15.00
            var price5: Double = 20.00

            if ((price >= 0.00) && (price <= 10000.99)) {
                println("No discount")
            } else if ((price >= 10001.00) && (price <= 20000.99)) {
                var discount = price / price1 * price2
                var discount1 = price - discount
                println("your discount is $discount you will only pay $discount1")

            } else if ((price >= 20001.00) && (price <= 50000.99)) {
                var discount = price / price1 * price3
                var discount1 = price - discount
                println("your discount is $discount you will only pay $discount1")

            } else if ((price >= 50001.00) && (price <= 100000.99)) {
                var discount = price / price1 * price4
                var discount1 = price - discount
                println("your discount is $discount you will only pay $discount1")

            } else if ((price >= 100001.99)) {
                var discount = price / price1 * price5
                var discount1 = price - discount
                println("your discount is $discount you will only pay $discount1")

            }

        } catch (e: Exception) {
            println("Enter digits only")


    }



}
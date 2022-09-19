//Practice Activity #9
//Create a MobilePhone Class
//use ate least 5 attirbutes
//give atleast 5 behaviors
// Display
// Primary Constructor
// secondary constructor

fun main(){

////    var myPhone = MobilePhone("Samsung","Note 10","Gray", 10000,8)
////        var Oppo = MobilePhone(5000)
////
////    println(myPhone)
//    print("Please enter brand: ")
//    var myPhone = MobilePhone (readln()) // brand
//    println("---------------------")
//
//    print("Please enter price: ")
//    var myPhonePrice = MobilePhone (readln().toInt()) // price
//    println("---------------------")
//
    var myPhone = MobilePhone ("gray", 32)
    println("---------------------")

    println("----- Special features -----")
    myPhone.chargingtime()
    myPhone.size()
    myPhone.port()
    myPhone.network()
    myPhone.waterproof()
}

// CLASS

class MobilePhone(var brand: String, var modelName: String, var color: String, var price: Int, var megapixels: Int) { // constructor > Primary constructor

    init { // Initializer - once class is called will start init immediately.
        println("Your Mobile Phone Specs are:")
        println("Brand: $brand")
        println("Model: $modelName")
        println("Color: $color")
        println("Price: $price")
        println("Camera:$megapixels megapixels")
    }

// SECONDARY CONSTRUCTOR
    constructor(brand: String):this(brand,"A3", "Gray", 5000, 32) {}
    constructor(price: Int) : this("Oppo", "B10", "white", price, 16) {}
    constructor(brand: String, megapixels: Int) : this(brand, "P40", "Gray" , 10000, megapixels) {}

            // BEHAVIORS
            fun chargingtime() {
                println("Fast charging")
            }

            fun size() {
                var sizeinches: Double = 6.6
                println("Size: $sizeinches inches")
            }

            fun port() {
                println("Type C USB port")
            }

            fun network() {
                println("2G / 3G / 4G")
            }

            fun waterproof() {
                println("Water proof")
            }
}


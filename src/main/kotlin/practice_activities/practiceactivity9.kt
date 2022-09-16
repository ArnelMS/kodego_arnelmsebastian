//Practice Activity #9
//Create a MobilePhone Class
//use ate least 5 attirbutes
//give atleast 5 behaviors
// Display
// Primary Constructor
// secondary constructor

fun main(){

    var myPhone = mobilePhone("Samsung","Note 10","Gray", 10000,8)

    println(myPhone)
    println("----- Special features -----")
    myPhone.chargingtime()
    myPhone.size()
    myPhone.port()
    myPhone.network()
    myPhone.waterproof()
}

// CLASS

class mobilePhone(var brand: String, var modelName: String, var color: String, var price: Int, var megapixels: Int) { // constructor > Primary constructor

    init { // Initializer - once class is called will start init immediately.
        println("Your Mobile Phone Specs are:")
        println("Brand: $brand")
        println("Model: $modelName")
        println("Color: $color")
        println("Price: $price")
        println("Camera:$megapixels megapixels")
    }

//            // SECONDARY CONSTRUCTOR
//            constructor(brand: String) : this(brand, color = "White") {}
//            constructor(modelName: String) : this(color = "White") {}

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

//
//        // Secondary constructors
//        constructor(name: String) : this(name, 0)
//        constructor(age: Int) : this("default_name", age)
//        println("Object Created")
//        println("name is $name")
//        println("name is $age")
//    }
//    fun walk() {
//        println("A person walks")
//    }
//
//    fun eat() {
//        println("A person eats")
//    }
//    fun displayAge(){
//        //var age : Int = 7
//        println(age)
//    }
//
//    fun ageUp() {
//        age++
//    }

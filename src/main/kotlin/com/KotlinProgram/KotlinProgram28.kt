fun main(){

    var myCar = Car ()
//    myCar.modelName="BMW"
//    println(myCar.modelName)
    myCar.fuelVolume = 600
    println(myCar.fuelVolume)
}


// CLASS
class Car {
    var modelName: String = " "
        get() = field
        set(value) {
            field = value
        }

    var fuelVolume: Int = 0
        get() = field           // will work even if implicit // get field is to get "variable"
        set(value) {            // will work even if implicit
            if (value < 0) {
                println("Invalid Value")
            } else {
                field = value
            }
        }

    init {
                println("Object Created")
                println("modelName is $modelName")
                println("FuelVolume is $fuelVolume")
            }


            // BEHAVIOR
            fun accelarate(fuelVolume: Int) {
                this.fuelVolume = this.fuelVolume - fuelVolume
            }

            fun checkFuel() {
                println("Current fuel volume is $fuelVolume")
            }
        }


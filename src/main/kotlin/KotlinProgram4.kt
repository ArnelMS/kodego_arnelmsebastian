fun main() {

    var grade: Int = 100

    if ((grade >= 96) && (grade <= 100)) {
        println("1.00")
    } else if ((grade >= 86) && (grade <= 95)) {
        println("1.75")
    } else if ((grade >= 76) && (grade <= 85)) {
        println("2.25")
    } else if (grade < 75) {
        println("5.00")
    } else {
        println("Invalid grade")
    }
    var gender: String = "M"
    if (gender == "M") {
        println("Male")
    }else if (gender == "F") {
        println("Female")
    } else {
        println("Invalid choice")
    }
    //Range
        var idNumber: Int = 4

        //True "&& = Always True"
        if ((idNumber >= 1) && (idNumber <= 3)) {
            println("Valid id number")
            println("Success!")
        }else{
    println("Invalid id number")}

    println()
    println("--Line Ends--")

}
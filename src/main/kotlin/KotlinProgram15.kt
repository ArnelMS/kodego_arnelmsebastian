fun main() {
    var num = arrayOf(
        arrayOf<String>("Peter", "Paul", "Mary"),
        arrayOf<String>("John", "Mark", "Matthew"),
        arrayOf<String>("James", "Luke", "Zachary")
    )
    var row: Int = 0
    while (row < 3) {
        var column: Int = 0
        while (column < 3) {
            print(" ${num[row][column]} ")
            column++
        }
        println()
        row++

//    }
//
//    // REVERSED
//    var num = arrayOf(
//                        //0      //1    //2
//        arrayOf<String>("Peter","Paul","Mary"), //0
//        arrayOf<String>("John","Mark","Matthew"), //1
//        arrayOf<String>("James","Luke","Zachary") //2
//    )
//    var row: Int = 0
//    while (row<3){
//        var column : Int = 2
//        while (column >=0){
//            print(" ${num[row][column]} ")
//            column--
//        }
//        println()
//        row++
//    }
    }
}
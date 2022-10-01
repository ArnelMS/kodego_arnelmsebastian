fun main() {

    var myObject = MyClass1("Hello World")
    var myObject2 = MyClass1("Hi World")

}

//generics
        class MyClass1(value: String) {
        init {
            println(value)
        }
    }



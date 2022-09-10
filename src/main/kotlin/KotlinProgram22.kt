fun main() {

//    println("Enter number 1:")
//    var number : Int = readln().toInt()
//
//    println("The cube is ${number * number * number}")
//
//    println("Enter number 2:")
//    var number2 : Int = readln().toInt()
//
//    println("The cube is ${number2 * number2 * number2}")

    println("Enter your name: ")
    var name : String = readln()
    println("Enter your age: ")
    var age : Int = readln().toInt()
    displayNameAndAge(name, age)

}

// No Return, No Parameter using "Unit"
// Unit = Void
fun displayName() : Unit {
    println("Peter")
}


// No Return, With Parameter
fun displayMessage(msg : String) : Unit {
    println("The message is $msg")
}

// No Return, With 2 Parameters
fun displayNameAndAge(name : String, age : Int) : Unit {
    println("Your name is $name")
    println("Your age is $age")
}

// Function ->  Methods ->  Stored Procedures   -> Sub Procedure

// Built-in / Standard Functions in Kotlin
// Abstraction

// println()
// toInt
// readInt
//
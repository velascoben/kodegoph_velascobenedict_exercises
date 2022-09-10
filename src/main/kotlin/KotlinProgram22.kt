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

    displayMessage(readln())

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

// Function ->  Methods ->  Stored Procedures   -> Sub Procedure

// Built-in / Standard Functions in Kotlin
// Abstraction

// println()
// toInt
// readInt
//
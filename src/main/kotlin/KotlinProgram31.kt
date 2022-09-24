import java.lang.Exception

fun main() {
    try {
        println("Enter number 1: ")
        var num1 : Int = readln().toInt()
    } catch (e:Exception) {
        println("Invalid input! Digits only!")
    }
    println("-End of Code-")


//    var numbers = arrayOf(4,2,1)
//    println(numbers[3])

//    println(2/0)
}


// Exception
// Something that disrupts a normal flow of your code
// Recoverable - you handle exceptions

// Error
// Unrecoverable
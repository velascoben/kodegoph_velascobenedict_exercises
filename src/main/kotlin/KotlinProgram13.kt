fun main() {
    // Implicit Declaration
    // Array Size           0       1       2
    val names = arrayOf("John", "Paul", "Mark")
    println(names[0])

    // Explicit Declaration
    var numbers = arrayOf<Int>(2,3,10,12,9) // Use to explicitly just use Integer values
    println(numbers[4])

    // Array Size
    println(numbers.size)

}
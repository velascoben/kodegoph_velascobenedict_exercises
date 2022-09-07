fun main() {
    // Implicit Declaration
    // Array Size           0       1       2
    var names = arrayOf("John", "Paul", "Mark")
    println(names[0])

    // Explicit Declaration
    var numbers = arrayOf<Int>(2,3,10,12,9) // Use to explicitly just use Integer values
    println(numbers[4])

    // Array Size
    println(numbers.size)
    println("@@@@@@@@@@@@@@@")
    println(names[0])
    println(names[1])
    println(names[2])
    println("@@@@@@@@@@@@@@@")
    names.set(1, "Matthew")
    println("@@@@@@@@@@@@@@@")
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))
}
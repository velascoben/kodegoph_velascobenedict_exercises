fun main() {
    println("Enter number:")
    var result = cube(readln().toInt())
    println("The cube is $result")

    println("Enter numbers: ")
    println(add(readln().toInt(), readln().toInt()))
}

fun cube(number : Int) : Int {
    var compute = number * number * number
    //return println("The cube of $number is $compute")
    return compute
}

fun add(number1 : Int, number2 : Int) : Int {
    println("Welcome to the Add Function!")
    return number1+number2
}
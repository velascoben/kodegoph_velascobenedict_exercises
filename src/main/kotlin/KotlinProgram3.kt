fun main() {
    var number1 : Double = 21.0
    var number2 : Double = 9.0
    var number3 : Double = 9.0

    var sum : Double = number1 + number2
    var sub : Double = number1 - number2
    var times : Double = number1 * number2
    var divide : Double = number1 / number2
    var modulo : Double = number1 % number2

    println("Sum is $sum")
    println("Difference is $sub")
    println("Product is $times")
    println("Quotient is $divide")
    println("Modulo is $modulo")

    // Complex Operations

    var complexFormula = (10*2)+(10/2)

    println(complexFormula)

    // Comparison Operators

    var expression : Boolean = number1 >= number2

    println(expression)

    // Increment Operator

    number1 = ++number1

    println(number1)
}

/*
fun main() {
    var numbers = mutableListOf<Int>()

    var ctr : Int = 0

    while (ctr < 5) {

        println("Enter number ${ctr+1}:")
        var input = readln().toInt()
        numbers.add(input)
        ctr++
    }

    println("Displaying List: ")
    for (value in numbers) {
        println(value)
    }
}
*/


fun main() {
    var numbers = mutableListOf<Int>()
    var input : Int = 1
    var ctr : Int = 1

    while (input > 0) {

        println("Enter number ${ctr}:")
        input = readln().toInt()
        numbers.add(input)
        ctr++

    }

    println("Displaying Sum: ")
    var sumNumbers : Int = 0
    for (value in numbers) {
        sumNumbers += value
    }

    println(sumNumbers)
}

fun main() {

    var numbers = intArrayOf(0,0,0)

    for(i in  0 .. 2) {
        println("Enter number ${i+1}")
        var num = readln().toInt()
        numbers[i] = num
    }

    println(total(*numbers))
}

fun total(vararg numbers : Int) : Int {
    var total : Int = 0
    for(value in numbers) {
        total += value
    }

    return total

}

// ------------------------- Other Code ----------------------- //

/*
fun main() {

    var numbers = arrayListOf<Int>()
    var input : Int = 1
    var ctr : Int = 1

    while (input > 0) {
        println("Enter a number: (Enter '0' to exit)")
        input = readln().toInt()
        if(input > 0)
            numbers.add(input)
        ctr++

    }

    println(total2(numbers))

}

fun total(number : ArrayList<Int>): Int {

    var sumNumbers : Int = 0
    for (value in number) {
        sumNumbers += value
    }

    return sumNumbers
}
 */
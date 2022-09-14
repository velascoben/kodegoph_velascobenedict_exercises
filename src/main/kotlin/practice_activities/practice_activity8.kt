package practice_activities
fun main() {
    //println(maxNumber(8,3,5))

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

//    var largest : Int = numbers[0]
//
//    for (num in numbers) {
//    if (num > largest)
//            largest = num
//    }
//
//    println(largest)

    println(maxNumber(numbers))

}

fun maxNumber(numberArray : ArrayList<Int>): Int {

    var largest : Int = numberArray[0]

    for (num in numberArray) {
    if (num > largest)
            largest = num
    }

    return largest
}


fun main() {
    //println(total(2,4,4,6))

    //var numbers = arrayListOf<Int>()

    println(total2(2,4,4,6,6,7,8,8,8,8,8))



}

fun total(num1 : Int, num2 : Int, num3 : Int, num4 : Int) : Int {
    println("This is the total function!")
    return num1 + num2 + num3 + num4
}

fun total2(vararg numbers: Int): Int {

    var sumOfAllNumbers : Int = 0
    for (num in numbers) {
        sumOfAllNumbers += num
    }

    return sumOfAllNumbers
}
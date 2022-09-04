fun main() {

    println("Enter a number between 1-3:")
    var itemNumber : Int = readln().toInt()

    when(itemNumber) {
        1 -> print("Clothes")
        2 -> print("Food")
        3 -> print("Toiletries")
        else -> print("Invalid Number")
    }
}
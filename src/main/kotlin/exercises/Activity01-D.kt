package exercises

fun main() {
    /*

    Activity 01 - D

    Create an application that will accept monetary amounts.
    The application will continue to accept values until a “No” is set as input for the question
    “Do you want to add another amount?”.
    After the input is done, the user will be asked “Divide the value by how many?”.
    It will only accept an Integer as input.
    The total of the first input will be divided by the second input.

    Note: Error checking must be done.

     */

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var amount : Double = 0.00
    var divideBy : Int = 0
    var again : String = ""
    var total : Double = 0.00

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    do {

        println("Enter amount:")
        amount = readln().toDouble()

        amount += amount

        println("Do you want to add another amount? ")
        again = readln()

    }
    while (again == "Yes")

    println("Divide the value by how many?")
    divideBy = readln().toInt()

    total = amount / divideBy

    println("The result is $total")







}
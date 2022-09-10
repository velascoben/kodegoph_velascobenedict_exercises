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
    var divideBy : Double = 0.00
    var again : String = "YES"
    var sum : Double = 0.00
    var total : Double = 0.00

    // ------------------------------------------- DECLARATIONS END ------------------------------- //
    while (again == "YES") {

        println("Enter amount:")
        amount = readln().toDouble()

        sum += amount

        println("Do you want to add another amount to $sum? YES or NO?")
        again = readln().uppercase()

    }

    println("Divide the value by how many?")
    divideBy = readln().toDouble()

    total = sum / divideBy

    println("The result is $total")


}
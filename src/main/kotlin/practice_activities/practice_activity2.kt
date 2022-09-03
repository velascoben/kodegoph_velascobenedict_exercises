package practice_activities

fun main() {
    /*
    Create a Kotlin program that will accept grades, then calculates and display their average grade.

    Sample Output

    Enter Grade in Math:
    78

    Enter  Grade in English:
    81

    Enter  Grade in Filipino:
    98

    Average Grade is: 85.66
     */

    println("Enter Grade in Math: ")
    var math : Double = readln().toDouble()

    println("Enter Grade in English: ")
    var english : Double = readln().toDouble()

    println("Enter Grade in Filipino: ")
    var filipino : Double = readln().toDouble()

    var ave : Double = (math + english + filipino) / 2

    println("Average Grade is: " + String.format("%.2f", ave).toDouble())
}
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

fun main() {

    /*

    Create a kotlin program called PracticeActivity7.kt that computes the perimeter and area of a rectangle.
    Designate functions calculatePerimeter() and calculateArea() that will facilitate the computation of values.
    No println() or display of output should be seen inside these functions.

    Sample Input/Method
    Enter length: 4.5
    Enter width: 2.0

    Perimeter is 13.00 meters
    Area is 9.00 meters

     */

    println("Enter length:")
    var length : Double = readln().toDouble() // Get length value

    println("Enter width:")
    var width : Double = readln().toDouble() // Get width value

    calculatePerimeter(length, width) // Call function to calculate perimeter
    calculateArea(length, width) // Call function to calculate area

}

// Calculate Perimeter Here
fun calculatePerimeter(length : Double, width : Double) {
    var perimeter = (length*2) + (width*2)
    println("Perimeter is ${decimalFormat(perimeter)} meters")
}

// Calculate Area Here
fun calculateArea(length : Double, width : Double) {
    var area = length*width
    println("Area is ${decimalFormat(area)} meters")
}

// Format to decimal
fun decimalFormat(value : Double): String {
    return String.format("%,.2f", value)
}


import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    println("Enter number 1: ")
    var num1 : Int = readln().toInt()

    println("Enter number 1: ")
    var num2 : Int = readln().toInt()

    println("Enter number 1: ")
    var num3 : Int = readln().toInt()

    var total : Int = num1 + num2 + num3

    try {
        println("Divide by how many?")
        var divisor : Int = readln().toInt()
        println("The answer is ${total / divisor}")
    }catch (e:ArithmeticException) {
        println(e.message)
        println("Division by 0 is not allowed!")
    }catch (e:NumberFormatException) {
        println(e.message)
        println("Input digits only!")
    }catch (e:ArrayIndexOutOfBoundsException) {
        println(e.message)
        println("Invalid Index!")
    }finally {
        println("Code finished!")
    }

}
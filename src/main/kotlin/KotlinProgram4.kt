fun main() {

    println("Enter your grade:")
    var grade : Int = readln().toInt()

    if((grade >= 96) && (grade <= 100)) {
        println("1.00")
    } else if((grade >= 86) && (grade <= 95)) {
        println("1.75")
    } else if((grade >= 76) && (grade <= 85)) {
        println("2.25")
    } else if(grade <= 75) {
        println("5.0")
    } else {
        println("Invalid Grade")
    }

    println("Enter your gender:")
    var gender : String = readln()

    if(gender == "M") {
        println("Male")
    } else if (gender == "F") {
        println("Female")
    } else {
        println("Invalid Choice")
    }

    // Conditions Range

    var idNumber : Int = 1
    // True
    if((idNumber >= 1) && (idNumber <= 3)) {
        println("Valid ID Number")
        println("SUCCESS!!!")
    }



    println("Line Ends")
}
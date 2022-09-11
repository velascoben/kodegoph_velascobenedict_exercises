package exercises

// ------------------------------------------- DECLARATIONS ------------------------------- //

var answer : String = "y"
var again : Boolean = true
var option : String = "y"

// Student Data
var students = arrayOf<String>("Ben","John","Michael")

// Final Grades
var studentFinalGrade = arrayOf<Double>(0.00,0.00,0.00)
var studentMonth1Grade = arrayOf<Double>(0.00,0.00,0.00)
var studentMonth2Grade = arrayOf<Double>(0.00,0.00,0.00)
var studentMonth3Grade = arrayOf<Double>(0.00,0.00,0.00)
var studentMonth4Grade = arrayOf<Double>(0.00,0.00,0.00)

// ------------------------------------------- DECLARATIONS END ------------------------------- //

fun main() {
    /*

    Activity 02 - D

    Implement Activity 02 - A using Classes.

     */

    while (again == true) {

        println("MD1P STUDENTS' PERFORMANCE UPDATE")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show Enrolled Students'")
        println("[2] Show Students' Grades")
        println("[3] Updates Students' Grades")
        println("[x] Exit System")

        print("Answer: ")
        option = readln()

        ShowStudents(option)

    }

}

class ShowStudents<T>(value : T){
    init {
        if (option == "1") {

            println("-Enrolled Students'-")
            var ctr: Int = 0
            for (value in students) {
                println("[${ctr + 1}] ${students[ctr]}")
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option = readln()

        } else if (option == "2") {
            println("-Students' Grades-")
            var ctr: Int = 0
            for (value in students) {
                println("[${ctr + 1}] ${students[ctr]}")
                println("1st Month Grade: ${studentMonth1Grade[ctr]}")
                println("2nd Month Grade: ${studentMonth2Grade[ctr]}")
                println("3rd Month Grade: ${studentMonth3Grade[ctr]}")
                println("4th Month Grade: ${studentMonth4Grade[ctr]}")
                println("Final Month Grade: ${studentFinalGrade[ctr]}")
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option = readln()

        } else if (option == "3") {

            println("-Enrolled Students'-")
            var ctr: Int = 0
            for (value in students) {
                println("[${ctr + 1}] ${students[ctr]}")
                ctr++
            }

            println("\nChoose a Student to Update:")
            var studentID: Int = readln().toInt()

            println("Student: ${students[studentID - 1]}")
            println("[1] Month1 Grade: ${studentMonth1Grade[studentID - 1]}")
            println("[2] Month2 Grade: ${studentMonth2Grade[studentID - 1]}")
            println("[3] Month3 Grade: ${studentMonth3Grade[studentID - 1]}")
            println("[4] Month4 Grade: ${studentMonth4Grade[studentID - 1]}")
            if (studentMonth4Grade[studentID - 1] != 0.00) {
                println("Final Grade: ${(studentMonth1Grade[studentID - 1] + studentMonth2Grade[studentID - 1] + studentMonth3Grade[studentID - 1] + studentMonth4Grade[studentID - 1]) / 4}")
            } else{
                println("Final Grade: ${studentFinalGrade[studentID - 1]}")
            }
            print("Which grading period to update?: ")
            var period : Int = readln().toInt()

            if (period == 1) {
                println("Enter Grade for 1st Month: ")
                studentMonth1Grade.set(studentID - 1,readln().toDouble())
            } else if (period == 2) {
                println("Enter Grade for 2nd Month: ")
                studentMonth2Grade.set(studentID - 1,readln().toDouble())
            } else if (period == 3) {
                println("Enter Grade for 3rd Month: ")
                studentMonth3Grade.set(studentID - 1,readln().toDouble())
            } else if (period == 4) {
                println("Enter Grade for 4th Month: ")
                studentMonth4Grade.set(studentID - 1,readln().toDouble())
                var averageGrade : Double = (studentMonth1Grade[studentID - 1] + studentMonth2Grade[studentID - 1] + studentMonth3Grade[studentID - 1] + studentMonth4Grade[studentID - 1]) / 4
                studentFinalGrade.set(studentID - 1,averageGrade.toDouble())

            }

            println("\nGRADE SUCCESSFULLY UPDATED!")

        } else if (option == "x") {

            println("Thank you for using the system!")
            again = answer == "x"

        } else {

            println("Invalid option!")

        }
    }
}
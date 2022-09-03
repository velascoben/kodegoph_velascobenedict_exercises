package exercises
fun main() {
    /*

    Activity 01 - A

    You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.

     */

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    // Student Data
    var studentID : Int = 0
    var studentFirstName : String = ""
    var studentMiddleName : String = ""
    var studentLastName : String = ""
    var studentClassCode : String = ""

    // Final Grades
    var studentFinalGrade : Double = 0.00
    var studentMonth1Grade : Double = 0.00
    var studentMonth2Grade : Double = 0.00
    var studentMonth3Grade : Double = 0.00
    var studentMonth4Grade : Double = 0.00

    // Month1 Grades
    var studentM1Week1Grade : Double = 0.00
    var studentM1Week2Grade : Double = 0.00
    var studentM1Week3Grade : Double = 0.00
    var studentM1Week4Grade : Double = 0.00

    // Month2 Grades
    var studentM2Week1Grade : Double = 0.00
    var studentM2Week2Grade : Double = 0.00
    var studentM2Week3Grade : Double = 0.00
    var studentM2Week4Grade : Double = 0.00

    // Month3 Grades
    var studentM3Week1Grade : Double = 0.00
    var studentM3Week2Grade : Double = 0.00
    var studentM3Week3Grade : Double = 0.00
    var studentM3Week4Grade : Double = 0.00

    // Month4 Grades
    var studentM4Week1Grade : Double = 0.00
    var studentM4Week2Grade : Double = 0.00
    var studentM4Week3Grade : Double = 0.00
    var studentM4Week4Grade : Double = 0.00

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    // ------------------------------------------- FORMULA ------------------------------- //

    studentMonth1Grade = studentM1Week1Grade + studentM1Week2Grade + studentM1Week3Grade + studentM1Week4Grade
    studentMonth2Grade = studentM2Week1Grade + studentM2Week2Grade + studentM2Week3Grade + studentM2Week4Grade
    studentMonth3Grade = studentM3Week1Grade + studentM3Week2Grade + studentM3Week3Grade + studentM3Week4Grade
    studentMonth4Grade = studentM4Week1Grade + studentM4Week2Grade + studentM4Week3Grade + studentM4Week4Grade

    studentFinalGrade = studentMonth1Grade + studentMonth2Grade + studentMonth3Grade + studentMonth4Grade

    // ------------------------------------------- FORMULA END ------------------------------- //


    // Initial Understanding

    println("MD1P STUDENTS' PERFORMANCE UPDATE")

    var student1 : String = "Week1 = 95, Week2 = 90, Week3 = 92, Week 4 = No Grade Yet"
    var student2 : String = "Week1 = 90, Week2 = 89, Week3 = 90, Week 4 = No Grade Yet"
    var student3 : String = "Week1 = 88, Week2 = 87, Week3 = 85, Week 4 = No Grade Yet"

    println("1. Student 1 Grades")
    println(student1)
    println("")
    println("2. Student 2 Grades")
    println(student2)
    println("")
    println("3. Student 3 Grades")
    println(student3)
    println("")
    println("")

    println("Choose the number of the student you wish to update grades: ")
    var studentChosen : String = readln()

    println("You have chosen Student$studentChosen: ")
    println("Enter grade for Week4: ")
    var upgrade : String = readln()











    if(studentChosen == "1") {
        student1 = "Week1 = 95, Week2 = 90, Week3 = 92, Week 4 = $upgrade"
    } else if(studentChosen == "2") {
        student2 = "Week1 = 90, Week2 = 89, Week3 = 90, Week 4 = $upgrade"
    } else {
        student3 = "Week1 = 88, Week2 = 87, Week3 = 85, Week 4 = $upgrade"
    }

    println("1. Student 1 Grades")
    println(student1)
    println("")
    println("2. Student 2 Grades")
    println(student2)
    println("")
    println("3. Student 3 Grades")
    println(student3)
    println("")

    println("Students' Performance Saved!")

}
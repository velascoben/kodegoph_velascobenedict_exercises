fun main() {
    /*

    Activity 01 - A

    You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.

     */

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
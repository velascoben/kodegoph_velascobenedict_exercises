package practice_activities

fun main() {

    /*

    Enter Your FirstName:
    John
    Enter Your Middle Name/Initial
    C.
    Enter Your Last Name
    Smith
    Your Name is John C. Smith

    */

    print("Enter Your FirstName: ")
    var fname : String = readln()

    print("Enter Your Middle Name/Initial: ")
    var mname : String = readln()

    print("Enter Your Last Name: ")
    var lname : String = readln()

    println("Your Name is " + fname + " " + mname + " " + lname)

}
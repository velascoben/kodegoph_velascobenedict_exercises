package com.oop

class Student(_studentID : Int) : Person() {

    var studentID : Int = _studentID

    fun displayStudentID() {
        println(studentID)
    }

    override fun displayName() { // Polymorphism
        super.displayName()
        println("Displaying function displayName from Student class")
    }
}
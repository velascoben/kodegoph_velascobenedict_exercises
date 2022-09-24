package com.oop

open class Person {

    // Abstraction
    // Encapsulation

    var name : String = "John"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var age : Int = 23
        get() {
            return field
        }
        set(value) {
            if(value < 1) {
                println("Invalid Age!")
            } else {
                field = value
            }

        }
    init {
        println("Object Created!")
        println("Name is $name, age is $age")
    }

    fun upAge() : Int {
        age++
        return age
    }

    fun changeAge(age : Int) {
        println(age)
    }

    open fun displayName() { // Polymorphism
        println("The name is $name")
    }
}
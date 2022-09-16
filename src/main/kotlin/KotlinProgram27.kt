fun main() {
    var anne = Person(20)
    anne.age = 25
    anne.displayAge()

}

class Person(var name : String, var age : Int) { // Constructor ->primary constructor

    init {

        println("Object Created")
        println("Name is $name")
        println("Age is $age")

    }

    constructor(name : String) : this(name,0){} // -> Secondary Constructor
    constructor(age : Int) : this("default_name",age){}

    fun walk() {
        println("A person walks")
    }

    fun eat() {
        println("A person eats")
    }

    fun displayAge(){
        //var age : Int = 7
        println(age)
    }

    fun ageUp() {
        age++
    }
}
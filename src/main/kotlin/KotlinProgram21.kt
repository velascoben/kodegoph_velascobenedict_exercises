fun main() {

    //var myObject = myClass("Hello World")

    println("Enter anything: ")
    MyGenericClass(readln())

}

class MyGenericClass<T>(value : T){
    init {
        println(value.toString())
    }
}
class MyClass(value : String) {
    init {
        println(value)
    }
}

/*

Class       ->  objects
object      ->  variable
            ->  functions(process)
uppercase   ->  first letter
example
String
Int

 */
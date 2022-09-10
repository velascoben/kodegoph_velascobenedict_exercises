fun main() {

    //var myObject = myClass("Hello World")

    println("Enter anything: ")
    var myObject = myGenericClass(readln())

}

class myGenericClass<T>(value : T){
    init {
        println(value.toString().length)
    }
}
class myClass(value : String) {
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
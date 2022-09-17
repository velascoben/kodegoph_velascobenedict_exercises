fun main() {

}

class Empty{} // Usually used as placeholder

class Outer {
    val name ="Outer"

    fun show() = "The name: $name"

    class Nested { // No access to function in the class where it belongs
        val name ="Nested"
        fun show() = "The name $name"
    }
}

class Outer2 {
    val name1 ="Duter2"

    fun show() = "The name: $name1"

    inner class Inner { // Has access to functions in the class where it belongs
        val name2 ="Nested"
        fun show() = "Date: $name2 and $name1"
    }
}

// sealed class
// main class
// abstract class
// data class
fun main(){

    /*
    Enter 5 digits, store in array, display in correct sequence, display in reverse
    Enter number 1: 2

    Enter number 2: 4

    Enter  number 3: 6

    Enter number 4; 7

    Enter number 5: 10

    //store values in array (behind)

    //display array in correct sequence
    2 4 6 7 10

    //reverse
    10 7 6 4 2
     */

//    var answer : String = "Yes"
//    var numbers = ArrayList<Int>()
//
//    while (answer == "Yes") {
//
//        println("Enter a number: ")
//        var num: Int = readln().toInt()
//
//        numbers.add(num)
//
//        println("Add another number?")
//        answer = readln()
//
//    }
//
//    var count : Int = numbers.size
//    var a : Int = 0
//    var b : Int = 0
//
//    println(numbers.size)
//
//    while (a < count) {
//        print(numbers[a])
//        a++
//    }
//
//    println("\n")
//
//    count -= 1
//    while (count >= b) {
//        print(numbers[count])
//        count--
//    }
    var variableString: String = ""
    var string : String = "y"
    var countThis : Int = 1
    while (string != "x") {
        println("Enter number $countThis, (Enter 'x' - to Display): ")
        string = readln().lowercase()
        if (string != "x"){
            variableString += string
        }
    countThis++
    }

    var ctr : Int = 0
    var ctr2 : Int = variableString.length - 1

    print("Correct Sequence: ")
    while(ctr < variableString.length) {
        print(variableString[ctr])
        ctr++
    }

    println("")

    ctr = 0
    print("Reversed Sequence: ")
    while(ctr2 >= ctr) {
        print(variableString[ctr2])
        ctr2--
    }

}
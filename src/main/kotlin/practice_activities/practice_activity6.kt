

fun main() {

    /*
    Rewrite Activity-01 F so that its implements a function
    fun main(){
    println("Enter String: ")
    var input : String = readln()
    palindromeChecker(input)
    }

    fun palindromeChecker(input:String){
    //logic
    }
     */

    var string : String = "y"
    while (string != "x") {
        println("Enter string to check if Palindrome (Enter 'x' - to Exit): ")
        string = readln().lowercase()
            if (string != "x"){
                checkPalindrome(string)
            }
    }
}

fun checkPalindrome(value : String) {
    var lowerCased = value.lowercase()
    var reversed = lowerCased.reversed()

    if (value == reversed) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}
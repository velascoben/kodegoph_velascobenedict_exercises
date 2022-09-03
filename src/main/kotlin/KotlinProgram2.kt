fun main() {
    var string1 : String = "This is my String"
    var string2 : String = "This is my String, too!"
    var string3 : String = "This is my String"
    // String Character
    println(string1[5])
    println(string2[12])
    // String Length
    println(string1.length)
    println(string2.length)
    // String Equality
    println(string1 == string3)
    // String Uppercase
    println(string2.uppercase())
    // String Lowercase
    println(string2.lowercase())
    // String startswith
    println(string2.startsWith("this"))
    println(string2.startsWith("This"))
    // String endswith
    println(string2.endsWith("too!"))
    println(string2.endsWith("o"))
    // String Concatenate
    println(string1 + " " + string2)
    // String substring
    println(string1.substring(8,12))
    // String replace
    println(string1.replace("This","That"))

}
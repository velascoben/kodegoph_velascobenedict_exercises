fun main() {

    var names = ArrayList<String>()

    names.add("John")
    names.add("Peter")

    // Add elements
    println(names[0])
    println(names[1])

    // Remove elements
    names.removeAt(0) // Peter moves to index 0

    // Display names
    println(names[0])

}
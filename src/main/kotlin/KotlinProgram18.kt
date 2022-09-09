fun main() {

    // Declaring maps
    val map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary",)

    // Getting value from map
    println(map[1])
    println(map.get(2))

    // Traversing Keys
    for (key in map.keys) {
        println(key)
    }

    // Traversing Values
    for (value in map.values) {
        println(value)
    }

    // Mutable
    var map2 = mutableMapOf<Int,String>()
    map2.put(2,"John")
    map2.remove(2)
    println(map2)

}
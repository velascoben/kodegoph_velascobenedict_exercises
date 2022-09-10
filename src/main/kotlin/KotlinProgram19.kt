fun main(){
    var myList = listOf(2,5,3,1) // Readonly
    var myList2 = mutableListOf<Int>()

    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10

    for(myListValue in myList2) {
        println(myListValue)
    }

    // Get 2nd Element
    println(myList[1])

    // Display Size
    println(myList.size)

    for(listValue in myList) {
        println(listValue)
    }
}
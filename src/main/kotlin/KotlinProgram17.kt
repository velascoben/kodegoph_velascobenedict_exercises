fun main() {
    var mySet = setOf(3,6,1,2,2,2,2,2,) // setOf will not accept or display duplicates
    var mySet2 = mutableSetOf<Int>()
    var stringTry : String
    var count : Int

    println("Enter the string: ")
    stringTry = readln()
    count = stringTry.length

//    for ()

    mySet2.add(5)
    mySet2.add(7)
    mySet2.add(8)

//    mySet2.remove(8)

    for (data in mySet2) {
        print(data)
    }

//    println(mySet.count())
//    println(mySet.sum())
//    println(mySet.average())
//
//    for(data in mySet) {
//        print(data)
//    }
//
//    var setA = setOf(2,5,7,8)
//    var setB = setOf(1,3,5,7)
//
//    // Union - unites all and remove duplicates
//    println(setA.union(setB))
//
//    // Intersection - displays only duplicates
//    println(setA.intersect(setB))
//
//    // Difference - displays what is unique to the set
//    println(setA.minus(setB))
//    println(setB.minus(setA))

}
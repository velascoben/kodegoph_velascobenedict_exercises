fun main() {
    var mySet = setOf(3,6,1,2,2,2,2,2,)

    println(mySet.count())
    println(mySet.sum())
    println(mySet.average())

    for(data in mySet) {
        print(data)
    }

    var setA = setOf(2,5,7,8)
    var setB = setOf(1,3,5,7)

    // Union - unites all and remove duplicates
    println(setA.union(setB))

    // Intersection - displays only duplicates
    println(setA.intersect(setB))

    // Difference - displays what is unique to the set
    println(setA.minus(setB))
    println(setB.minus(setA))

}
fun main() {
    var mySet = setOf(3,6,1,2,2,2,2,2,) // setOf will not accept or display duplicates
    var mySet2 = mutableSetOf<Int>()

//    mySet2.remove(8)

//    for (data in mySet2) {
//        print(data)
//    }

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

    var check1stString = mutableSetOf<Char>()
    var check2ndString = mutableSetOf<Char>()
    var string1 : String = ""
    var string2 : String = ""
    var count1 : Int = 0
    var count2 : Int = 0
    var a : Int = 0
    var b : Int = 0

    println("Enter the 1st string: ")
    string1 = readln()

    println("Enter the 2nd string: ")
    string2 = readln()

    // Get 1st string characters
    count1 = string1.length
    while (a < count1) {
        check1stString.add(string1[a])
        a++
    }

    // Get 2nd string characters
    count2 = string2.length
    while (b < count2) {
        check2ndString.add(string2[b])
        b++
    }

//    println(check1stString)
//    println(check2ndString)

    // Display unique characters
    println(check1stString.minus(check2ndString))
    println(check2ndString.minus(check1stString))





}
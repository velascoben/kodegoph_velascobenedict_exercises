package exercises

import java.util.*

// ------------------------------------------- DECLARATIONS ------------------------------- //

var answer2 : String = "y"
var again2 : Boolean = true
var option2 : String = "y"
var inventory = arrayOf<String>("Apple","Orange","Banana","Coco Crunch","FruitLoops","Cocoa Puffs","Coca Cola","Sprite","Pepsi")
var inventoryCount = arrayOf<Int>(50,35,45,42,40,56,57,43,35)
var groceryCount = arrayOf<Int>(20,25,25,22,20,26,27,23,5)
var category = arrayOf<String>("Fruits","Fruits","Fruits","Cereals","Cereals","Cereals","Beverages","Beverages","Beverages")

// ------------------------------------------- DECLARATIONS END ------------------------------- //

fun main() {
    /*

    Activity 02 - F

    Implement Activity 02 - C using Classes.

     */

    while (again2 == true) {

        println("WELCOME TO THE CITY LIBRARY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show Inventory")
        println("[2] Add Inventory")
        println("[3] Show Grocery")
        println("[4] Add Grocery")
        println("[x] Exit System")

        print("Answer: ")
        option2 = readln()

        ShowOptions(option2)

    }


}

class ShowOptions<T>(value : T){
    init {
        if (option2 == "1") {

            println("-Inventory Count-")
            var ctr: Int = 0
            for (value in inventory) {

                if (category[ctr] == "Fruits") {
                    print("[--FRUITS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                } else if (category[ctr] == "Cereals") {
                    print("[--CEREALS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                } else {
                    print("[--BEVERAGES--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                }
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option2 = readln()

        } else if (option2 == "2") {
            println("-Inventory Update-")
            println("\nChoose an Inventory to Update:")
            var itemNumber: Int = readln().toInt()

            println("Item: ${inventory[itemNumber - 1]}")
            println("Count: ${inventoryCount[itemNumber - 1]}")

            print("How much to add to inventory item?: ")

            inventoryCount.set(itemNumber - 1, inventoryCount[itemNumber - 1] + readln().toInt())

            println("\nINVENTORY SUCCESSFULLY UPDATED!")

        } else if (option2 == "3") {

            println("-Grocery Count-")
            var ctr: Int = 0
            for (value in inventory) {
                if (category[ctr] == "Fruits") {
                    print("[--FRUITS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${groceryCount[ctr]}")
                } else if (category[ctr] == "Cereals") {
                    print("[--CEREALS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${groceryCount[ctr]}")
                } else {
                    print("[--BEVERAGES--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${groceryCount[ctr]}")
                }
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option2 = readln()

        } else if (option2 == "4") {

            println("-Grocery Update-")
            println("\nChoose a Grocery to Update:")
            var itemNumber: Int = readln().toInt()

            println("Item: ${inventory[itemNumber - 1]}")
            println("Count: ${groceryCount[itemNumber - 1]}")

            print("How much to add to grocery item?: ")
            var amount : Int = readln().toInt()

            inventoryCount.set(itemNumber - 1, inventoryCount[itemNumber - 1] - amount)
            groceryCount.set(itemNumber - 1, groceryCount[itemNumber - 1] + amount)

            println("\nGROCERY SUCCESSFULLY UPDATED!")

        } else if (option2 == "x") {

            println("Thank you for using the system!")
            again2 = answer2 == "x"

        } else {

            println("Invalid option!")

        }
    }
}
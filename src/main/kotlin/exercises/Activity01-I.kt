package exercises

import java.util.*

fun main() {
    /*

    Activity 01 - I

    Using Activity 01 - C and implement a process where items are added to the grocery.

     */

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var answer : String = "y"
    var again : Boolean = true
    var option : String = "y"
    var inventory = ArrayList<String>()
    var inventoryCount = ArrayList<Int>()
    var groceryCount = ArrayList<Int>()
    var category = ArrayList<String>()

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    inventory.add("Apple")
    inventory.add("Orange")
    inventory.add("Banana")
    inventory.add("Coco Crunch")
    inventory.add("FruitLoops")
    inventory.add("Cocoa Puffs")
    inventory.add("Coca Cola")
    inventory.add("Sprite")
    inventory.add("Pepsi")

    category.add("Fruits")
    category.add("Fruits")
    category.add("Fruits")
    category.add("Cereals")
    category.add("Cereals")
    category.add("Cereals")
    category.add("Beverages")
    category.add("Beverages")
    category.add("Beverages")

    inventoryCount.add(50)
    inventoryCount.add(35)
    inventoryCount.add(45)
    inventoryCount.add(42)
    inventoryCount.add(40)
    inventoryCount.add(56)
    inventoryCount.add(57)
    inventoryCount.add(43)
    inventoryCount.add(35)

    groceryCount.add(20)
    groceryCount.add(25)
    groceryCount.add(25)
    groceryCount.add(22)
    groceryCount.add(20)
    groceryCount.add(26)
    groceryCount.add(27)
    groceryCount.add(23)
    groceryCount.add(5)

    while (again == true) {

        println("WELCOME TO THE CITY LIBRARY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show Inventory")
        println("[2] Add Inventory")
        println("[3] Show Grocery")
        println("[4] Add Grocery")
        println("[x] Exit System")

        print("Answer: ")
        option = readln()

        if (option == "1") {

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
            option = readln()

        } else if (option == "2") {
            println("-Inventory Update-")
            println("\nChoose an Inventory to Update:")
            var itemNumber: Int = readln().toInt()

            println("Item: ${inventory[itemNumber - 1]}")
            println("Count: ${inventoryCount[itemNumber - 1]}")

            print("How much to add to inventory item?: ")

            inventoryCount.set(itemNumber - 1, inventoryCount[itemNumber - 1] + readln().toInt())

            println("\nINVENTORY SUCCESSFULLY UPDATED!")

        } else if (option == "3") {

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
            option = readln()

        } else if (option == "4") {

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

        } else if (option == "x") {

            println("Thank you for using the system!")
            again = answer == "x"

        } else {

            println("Invalid option!")

        }

    }


}
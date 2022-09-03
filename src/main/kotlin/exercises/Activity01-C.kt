package exercises

import java.util.*

fun main() {
    /*

    Activity 01 - C

    You are tasked to automate an inventory system for a grocery.
    Identify the items that can be bought in a grocery store.
    After listing the different items, identify the characteristics of the items.
    You are also tasked to group the items in categories to help manage the grocery.
    Use the proper data types.

     */

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var invCode : Int = 0
    var invCategoryCode : String = ""
    var invCount : Int = 0
    var invCountLow : Boolean = false
    var datePurchased : Date

    // ------------------------------------------- DECLARATIONS END ------------------------------- //




    var fruits : String = "FRUITS: \n F1 - Apple \n F2 - Orange \n F3 - Banana"
    var cereals : String = "CEREALS: \n C1 - Coco Crunch \n C2 - FruitLoops \n C3 - Cocoa Puffs"
    var beverage : String = "BEVERAGE: \n B1 - Coca-Cola (1.5 liter) \n B2 - Coca-Cola (1 liter) \n B3 - Sprite (1.5 liter)"

    println(fruits)
    println(cereals)
    println(beverage)

    println("\n Choose item to view inventory: ")
    var groceryChosen : String = readln()















    if (groceryChosen == "F1") {
        println("Item: Apple")
        println("Category: Fruits")
        println("Quantity: 50")
    } else if (groceryChosen == "F2") {
        println("Item: Orange")
        println("Category: Fruits")
        println("Quantity: 60")
    } else if (groceryChosen == "F3") {
        println("Item: Banana")
        println("Category: Fruits")
        println("Quantity: 65")
    } else if (groceryChosen == "C1") {
        println("Item: Coco Crunch")
        println("Category: Cereal")
        println("Quantity: 100")
    } else if (groceryChosen == "C2") {
        println("Item: FruitLoops")
        println("Category: Cereal")
        println("Quantity: 143")
    } else if (groceryChosen == "C3") {
        println("Item: Cocoa Puffs")
        println("Category: Cereal")
        println("Quantity: 156")
    }else if (groceryChosen == "B1") {
        println("Item: Coca-Cola (1.5 liter)")
        println("Category: Beverage")
        println("Quantity: 110")
    } else if (groceryChosen == "B2") {
        println("Item: Coca-Cola (1 liter)")
        println("Category: Beverage")
        println("Quantity: 127")
    } else if (groceryChosen == "B3") {
        println("Item: Sprite (1.5 liter)")
        println("Category: Beverage")
        println("Quantity: 108")
    }




}
package exercises

// ------------------------------------------- DECLARATIONS ------------------------------- //

var answerHere : String = "y"
var runAgain : Boolean = true
var optionHere : String = "y"

// Books Data
var books = arrayOf<String>("Halloween","Friday the 13th","Harry Potter and the Sorcerer's Stone", "Harry Potter and the Goblet of Fire","Encyclopedia","Webster's Dictionary")
var genre = arrayOf<String>("Horror","Horror","Fantasy","Fantasy","General","General")
var status = arrayOf<String>("Borrowed","Available","Available","Available","Available","Available")

// ------------------------------------------- DECLARATIONS END ------------------------------- //

fun main() {
    /*

    Activity 02 - B

    Implement Activity 01 -  B using data structure.

     */

    while (runAgain == true) {

        println("WELCOME TO THE CITY LIBRARY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show the books")
        println("[2] Borrow a book")
        println("[3] Return a book")
        println("[x] Exit Library")

        print("Answer: ")
        optionHere = readln()

        ShowMenu(optionHere)

    }

}

class ShowMenu<T>(value : T){
    init {
        if (optionHere == "1") {

            println("-Books-")
            var ctr: Int = 0
            for (value in books) {
                println("[${ctr + 1}] ${books[ctr]}")
                println("${genre[ctr]}")
                println("${status[ctr]}")
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            optionHere = readln()

        } else if (optionHere == "2") {
            println("-Borrow Books-")
            println("\nChoose a Book to Borrow:")
            var itemNumber: Int = readln().toInt()

            if (status[itemNumber - 1] == "Borrowed") {

                println("Warning! Book already borrowed. Choose another book.")

            } else {
                println("Title: ${books[itemNumber - 1]}")
                println("Genre: ${genre[itemNumber - 1]}")

                status.set(itemNumber - 1, "Borrowed")

                println("\nBOOK SUCCESSFULLY BORROWED!")
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            optionHere = readln()

        } else if (optionHere == "3") {

            println("-Return Books-")
            println("\nChoose a Book to Return:")
            var itemNumber: Int = readln().toInt()

            if (status[itemNumber - 1] == "Available") {

                println("Warning! Book already returned. Error Processing.")

            } else {

                println("Title: ${books[itemNumber - 1]}")
                println("Genre: ${genre[itemNumber - 1]}")

                status.set(itemNumber - 1, "Available")

                println("\nBOOK SUCCESSFULLY RETURNED!")

            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            optionHere = readln()

        } else if (optionHere == "x") {

            println("Thank you for using the system!")
            runAgain = answerHere == "x"

        } else {

            println("Invalid option!")

        }
    }
}
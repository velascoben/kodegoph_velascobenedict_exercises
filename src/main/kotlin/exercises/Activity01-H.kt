package exercises

import java.util.*

fun main() {
    /*

    Activity 01 - H

    Using Activity 01 - B and Implement a process where someone can borrow a book.

     */

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var borrowerName : String = ""
    var borrowerAddress : String = ""
    var bookCode : Int = 0
    var bookTitle : String = ""
    var bookGenre : String = ""
    var bookPlot : String = ""
    var dateBorrowed : String = ""
    var answer : String = "y"
    var again : Boolean = true
    var option : String = "y"

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    // ---------------------------------------------- Using Array ----------------------------------------------------------- //

    var books = ArrayList<String>()
    var genre = ArrayList<String>()
    var status = ArrayList<String>()

    books.add("Halloween")
    books.add("Friday the 13th")
    books.add("Harry Potter and the Sorcerer's Stone")
    books.add("Harry Potter and the Goblet of Fire")
    books.add("Encyclopedia")

    genre.add("Horror")
    genre.add("Horror")
    genre.add("Fantasy")
    genre.add("Fantasy")
    genre.add("General Information")

    status.add("Available")
    status.add("Available")
    status.add("Available")
    status.add("Available")
    status.add("Borrowed")

    while (again == true) {

        println("WELCOME TO THE CITY LIBRARY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show the books")
        println("[2] Borrow a book")
        println("[3] Return a book")
        println("[x] Exit Library")

        print("Answer: ")
        option = readln()

        if (option == "1") {

            println("-Books-")
            var ctr: Int = 0
            for (value in books) {
                println("[${ctr+1}]")
                println("${books[ctr]}")
                println("${genre[ctr]}")
                println("${status[ctr]}")
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option = readln()

        } else if (option == "2") {
            println("-Borrow Books-")
            println("\nChoose a Book to Borrow:")
            var itemNumber: Int = readln().toInt()

            println("Title: ${books[itemNumber - 1]}")
            println("Genre: ${genre[itemNumber - 1]}")

            println("\nEnter Borrower's Name: ")
            borrowerName = readln()
            println("\nEnter Borrower's Address: ")
            borrowerAddress = readln()

            status.set(itemNumber - 1, "Borrowed")

            println("\nBOOK SUCCESSFULLY BORROWED!")

        } else if (option == "3") {

            println("-Return Books-")
            println("\nChoose a Book to Return:")
            var itemNumber: Int = readln().toInt()

            println("Title: ${books[itemNumber - 1]}")
            println("Genre: ${genre[itemNumber - 1]}")

            status.set(itemNumber - 1, "Available")

            println("\nBOOK SUCCESSFULLY RETURNED!")

        } else if (option == "x") {

            println("Thank you for coming!")
            again = answer == "x"

        } else {

            println("Invalid option!")

        }

    }

}
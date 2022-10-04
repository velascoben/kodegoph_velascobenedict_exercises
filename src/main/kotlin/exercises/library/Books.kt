package exercises.library

class Books : Process(), Display {

    // Books Data
    var books = mutableListOf<String>(
        "Halloween",
        "Friday the 13th",
        "Harry Potter and the Sorcerer's Stone",
        "Harry Potter and the Goblet of Fire",
        "Encyclopedia",
        "Webster's Dictionary"
    )
    var genre = mutableListOf<String>(
        "Horror",
        "Horror",
        "Fantasy",
        "Fantasy",
        "General",
        "General"
    )
    var status = mutableListOf<String>(
        "Borrowed",
        "Available",
        "Available",
        "Available",
        "Available",
        "Available"
    )

    override fun listBooks() {

        for ((ctr, value) in books.withIndex()) {
            println("[${ctr + 1}] ${books[ctr]} (${genre[ctr]}) - ${status[ctr]}")
        }

    }

    fun addBooks(newTitle : String, newGenre : String, newStatus : String) : Boolean{

        if(books.contains(newTitle)) {

            return false

        } else {

            books.add(newTitle)
            genre.add(newGenre)
            status.add(newStatus)

            return true

        }

    }

    fun removeBooks(bookID : Int) : Boolean {

        try {
            books.removeAt(bookID - 1)
            return true
        } catch (e:IndexOutOfBoundsException) {
            return false
        }



    }

    fun borrowBooks(bookID : Int) : Boolean {

        if(status.get(bookID - 1) == "Borrowed") {

            return false

        } else {

            try {
                status.set(bookID - 1, "Borrowed")
                return true
            } catch (e:IndexOutOfBoundsException) {
                return false
            }
        }

    }

    fun borrowedBooks() : Boolean {
        var flag : Boolean = false
        var i : Int = 0
        for (book in books){
            if(status[i] == "Borrowed") {
                flag = true
                println("[${i + 1}] ${books[i]} (${genre[i]}) - ${status[i]}")
            }
            i++
        }
        return flag
    }

    fun returnBooks(bookID : Int) : Boolean {

            try {

            if (status.get(bookID - 1) == "Available") {

                return false

            } else {

                try {
                    status.set(bookID - 1, "Available")
                    return true
                } catch (e: IndexOutOfBoundsException) {
                    return false
                }
            }
        } catch (e:IndexOutOfBoundsException) {
            return false
        }
    }

    override fun border () {
        println("**************************************")
    }

    override fun loginPage () {
        println("-Login Page-")
    }

    override fun dashboardPage () {
        println("-Dashboard-")
    }

    override fun programTitle () {
        println("WELCOME TO THE CITY LIBRARY")
    }

}
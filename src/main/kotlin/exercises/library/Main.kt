package exercises.library

fun main() {

    // Declarations

    var userCredentials = SearchUsers()
    var userLogin = VerifyLogin()
    var booksList = Books()
    var options : String = ""
    var username : String = ""
    var password : String = ""
    var flag : Boolean = true
    var flag2 : Boolean = true

    // End Declarations

    while (flag) {

        booksList.border()
        booksList.programTitle()
        booksList.border()
        booksList.loginPage()
        print("Username: ")
        userLogin.user = readln()

        if(userLogin.user != "") {

            while (flag2) {

                booksList.border()
                username = userLogin.user
                println("Username: $username")
                print("Password: ")
                userLogin.pass = readln()

                if (userLogin.pass != "") {
                    flag2 = false
                    password = userLogin.pass

                    if (userCredentials.searchUser(username, password)) {
                        flag = false

                        while (options != "X") {

                            booksList.border()
                            booksList.programTitle()
                            booksList.border()
                            booksList.dashboardPage()
                            println("[1] Display Books")
                            println("[2] Add Books")
                            println("[3] Remove Books")
                            println("[4] Borrow Books")
                            println("[5] Return Books")
                            println("[X] Exit System")
                            print("Option: ")
                            options = readln().uppercase()

                            if (options == "1") {
                                booksList.border()
                                booksList.programTitle()
                                booksList.border()
                                println("-Display Books-")
                                booksList.listBooks()
                            } else if (options == "2") {
                                booksList.border()
                                booksList.programTitle()
                                booksList.border()
                                println("-Add Books-")
                                print("Title: ")
                                var title: String = readln()
                                print("Genre: ")
                                var genre: String = readln()
                                print("Status: ")
                                var status: String = readln()
                                var result: Boolean = booksList.addBooks(title, genre, status)
                                if (!result) {
                                    println("Book already exists!")
                                } else {
                                    println("Book successfully added!")
                                }
                            } else if (options == "3") {
                                booksList.border()
                                booksList.programTitle()
                                booksList.border()
                                println("-Remove Books-")
                                print("Book ID Number: ")
                                var bookID: Int = readln().toInt()
                                var result: Boolean = booksList.removeBooks(bookID)
                                if (!result) {
                                    println("Book does not exist!")
                                } else {
                                    println("Book successfully removed!")
                                }
                            } else if (options == "4") {
                                booksList.border()
                                booksList.programTitle()
                                booksList.border()
                                println("-Borrow Books-")
                                print("Book ID Number: ")
                                var bookID: Int = readln().toInt()
                                var result: Boolean = booksList.borrowBooks(bookID)
                                if (!result) {
                                    println("Book does not exist or already borrowed!")
                                } else {
                                    println("Book successfully borrowed!")
                                }
                            } else if (options == "5") {
                                booksList.border()
                                booksList.programTitle()
                                booksList.border()
                                println("-Return Books-")
                                var resultBorrowed: Boolean = booksList.borrowedBooks()
                                if (!resultBorrowed) {
                                    println("No books borrowed!")
                                } else {

                                    booksList.border()
                                    print("Choose Book ID Number: ")
                                    var bookID: Int = readln().toInt()


                                    var result: Boolean = booksList.returnBooks(bookID)
                                    if (!result) {
                                        println("Book does not exist or already returned!")
                                    } else {
                                        println("Book successfully returned!")
                                    }

                                }
                            }
                        }

                    } else {
                        flag = true
                        println("Invalid credentials!")
                    }

                }

                if (flag2) {
                    println("Password cannot be empty!")
                }

            }

        } else {
            flag = true
            println("Username cannot be empty!")
        }


    }

}

class VerifyLogin {

    var user : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }

    var pass : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }
}


fun String.checkIntOrString(): Any {
    var v = toIntOrNull()
    return when(v) {
        null -> "false"
        else -> "true"
    }
}
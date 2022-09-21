/*
Create a class called SmartPhone

attributes (use proper data types)
load
batteryCapacity
(you add your own)

functions:
buyLoad(amount) // Does not accept 0 or negative values
chargeBattery(percent) // Does not accept 0 or negative values, should not exceed 100%
sendTextMessage(message) // Display sent message, load wil decrement
checkBalance() // Display current load, if zero, display "Check operator services"
call(minutes) // 8 load per minute, will not push through if no sufficient load
 */


fun main() {

    var textMessage : String = ""
    var smartPhone = SmartPhone(20.0,50)

    var option: Int = 1

    while (option > 0) {
        println("********************************")
        println("What do you want do?")
        println("[1] Check Load")
        println("[2] Buy Load")
        println("[3] Check Battery")
        println("[4] Charge Battery")
        println("[5] Send a Message")
        println("[6] Call a Friend")
        println("[0] Exit System")
        println("********************************")
        print("Option: ")
        var input: String = readln()

        if (input.checkIntOrString() == "false") {

            println("Invalid Option!")

        } else if (input.checkIntOrString() == "true") {

            option = input.toInt()

            if (option == 1) { // Check Load
                smartPhone.checkBalance()
            } else if (option == 2) { // Buy Load
                print("How much load to buy?: ")
                smartPhone.buyLoad(readln().toInt())
            } else if (option == 3) { // Check Battery
                println("Your battery percentage is ${smartPhone.batteryPercentage}%")
            } else if (option == 4) { // Charge Battery
                if (smartPhone.batteryPercentage == 100) {
                    println("Battery is already full!")
                } else {
                    print("How much charged to battery?: ")
                    smartPhone.chargeBattery(readln().toInt())
                }
            } else if (option == 5) { // Send SMS
                println("Type text message: ")
                textMessage = readln()
                smartPhone.sendTextMessage(textMessage)
            } else if (option == 6) { // Call a Friend
                if (smartPhone.load == 0.0) {
                    println("Check operator services!")
                } else {
                    print("Total minutes called: ")
                    smartPhone.call(readln().toInt())
                }
            } else if (option == 0) { // Exit System
                println("---Exiting System---")
            } else {
                println("Invalid Option!")
            }
        }

    }
}

class SmartPhone(var load : Double, var batteryPercentage: Int) {

    init {
        println("--Tindahan ni Aling Nena--")
        println("Initial value of load is $load and battery percentage is $batteryPercentage%")
    }

    fun buyLoad(amount: Int) { // Does not accept 0 or negative values
        if (amount <= 0) {
            println("Invalid value!")
        } else {
            load += amount
            println("Load successful!")
        }
    }

    fun chargeBattery(batteryPercentage: Int) { // Does not accept 0 or negative values, should not exceed 100%
        var checkBattery : Int = 0
        checkBattery = this.batteryPercentage + batteryPercentage
        if (checkBattery > 100) {
            println("Invalid battery charging!")
        } else if (batteryPercentage <= 0) {
            println("Invalid battery charging!")
        } else {
            this.batteryPercentage += batteryPercentage
            println("Battery charged!")
        }
    }


    fun sendTextMessage(message: String) { // Display sent message
        if(load == 0.0)
            println("Check operator services!")
        else
            println("Text message: \"$message\" sent successfully!")
            batteryPercentage--
            load--
            if(load < 0) {
                load = 0.0
            }
    }

    fun checkBalance() { // Display current load, if zero, display "Check operator services"
        if (load == 0.0)
            println("Check operator services!")
        else
            println("Your load is $load")

    }

    fun call(minutes: Int) {// 8 load per minute, will not push through if no sufficient load
        var totalCalls : Int = minutes * 8
        if (totalCalls > load) {
            println("Insufficient fund to make a call!")
        } else {
            batteryPercentage -= 2
            load -= (minutes * 8)
            println("Thank you for using our service!")
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


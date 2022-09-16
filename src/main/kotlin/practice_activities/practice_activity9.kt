fun main() {
    /*
    Create MobilePhone Class

    Give at least 5 attributes
    Give at least 5 behaviors

    Create 1 primary
    Create 2 secondary constructors
    */

    var answer : Boolean = true
    var option : String = "Yes"

    while (answer) {

        println("********************************")
        println("Enter Brand / Price:")
        var mobile: Any
        var input: String = readln()
        println("")
        if (input.intOrString() == "true") {
            mobile = Mobile(input.toInt())
        } else {
            mobile = Mobile(input)
        }
        mobile.currentBatteryLevel = 90
        println("Add to Battery:")
        var battery = readln().toInt()
        println("Battery Level: ${mobile.currentBatteryLevel}")
        mobile.charging(battery)
        mobile.checkBattery()
        println("********************************")
        mobile.waterproof()
        mobile.uniqueFeatures()
        mobile.superCharge()
        println("********************************")
        println("Try Again? Yes or No")
        option = readln().lowercase()
        answer = option == "yes"
    }

}

class Mobile(var mobileBrand : String, var mobilePrice : Int, var mobileModel : String,  var mobileMade : String, mobileBattery : Int) { // Constructor ->primary constructor

    var currentBatteryLevel : Int = 0
        get() = field
        set(value){
            if(value < 0) {
                println("Invalid value")
            } else {
                field = value
            }
        }


    init {
        println("********************************")
        println("Mobile Phone")
        println("Brand: $mobileBrand")
        println("Model: $mobileModel")
        println("Price: $mobilePrice")
        println("Made: $mobileMade")
        println("Battery: $mobileBattery")
        println("********************************")

    }

    constructor(mobileBrand : String) : this(mobileBrand,24000,"P40","China",90){} // -> Secondary Constructor
    constructor(mobilePrice : Int) : this("iPhone",mobilePrice,"iPhone 12","US",80){}

    fun uniqueFeatures() {
        println("Lie Detector Test.")
    }

    fun waterproof() {
        println("Mobile phone is water proof.")
    }

    fun superCharge() {
        println("Mobile phone has super charging feature.")
    }

    fun charging(currentBatteryLevel: Int) {
        this.currentBatteryLevel = this.currentBatteryLevel + currentBatteryLevel
    }

    fun checkBattery() {
        println("Updated battery level is $currentBatteryLevel")
    }
}

fun String.intOrString(): Any {
    var v = toIntOrNull()
    return when(v) {
        null -> "false"
        else -> "true"
    }
}


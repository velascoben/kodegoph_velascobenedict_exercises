fun main() {
    var myCar = Car()
    myCar.modelName = "BMW"
    println(myCar.modelName)
    myCar.fuelVolume = 600
    println(myCar.fuelVolume)
    myCar.accelerate(20)
    myCar.checkFuel()
}

class Car {

    var modelName : String = ""
        get() = field
        set(value) {
            field = value
        }

    var fuelVolume : Int = 0
        get() = field
        set(value){
            if(value < 0) {
                println("Invalid value")
            } else {
                field = value
            }
        }

    init {
        println("Object Created!")
        println("Model name is $modelName")
        println("Fuel volume is $fuelVolume")
    }

    fun accelerate(fuelVolume: Int) {
        this.fuelVolume = this.fuelVolume - fuelVolume
    }

    fun checkFuel() {
        println("Current fuel volume is $fuelVolume")
    }
}


object Car {
    private var heightCar : Int = 21
    fun printHeight(){
        println("Height car is $heightCar")
    }
}

class MotorCycle{
    companion object Testing{
        fun jump(){
            println("Jumping...")
        }
    }
//    fun flying(){
//        println("is flying...")
//    }
}

fun main(){
    // Object Declarations
    Car.printHeight()

    //Companion Object
    MotorCycle.jump()

    // Error
    // MotorCycle.flying()
}
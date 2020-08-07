object Car {
    private var heightCar : Int = 21
    fun printHeight(){
        println("Height car is $heightCar")
    }
}

open class MotorCycle{
    companion object Testing{
        fun jump(){
            println("Jumping...")
        }
    }
//    fun flying(){
//        println("is flying...")
//    }
    open fun riding(){
        println("Riding...")
    }
}

fun main(){
    // Object Declarations
    Car.printHeight()

    //Companion Object
    MotorCycle.jump()

    // Error
    // MotorCycle.flying()

    // Object Expression
    val person = object: MotorCycle(){
        override fun riding() {
            println("Riding Override...")
        }
    }
    person.riding()
}
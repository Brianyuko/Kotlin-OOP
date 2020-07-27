// Abstract Class
abstract class Animal(val name: String){
    abstract var color: String
    var foot: Int = 4
    abstract fun attack()
    abstract fun defend()
}

// An interface may not have a constructor
// Property initializer are not allowed in interfaces
interface Animals{
    // var foot: Int = 4
    var foot: Int
}

// Implement abstract base class member
class Lion(name: String): Animal(name) {

    override var color = "Yellow"
    override fun attack() {
        TODO("Not yet implemented")
    }

    override fun defend() {
        TODO("Not yet implemented")
    }

}
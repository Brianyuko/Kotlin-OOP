// Object Oriented Programming

fun main(){
    val person1 = User()
    // Setter Name
    person1.name = "Ahmad dimas"
    println("Nama saya ${person1.name}")
    println("Umur saya ${person1.age}")
}

class User{
    var name: String = ""
    var age: Int = 20
}
// Object Oriented Programming

// class NameClass (Constructor)
//By default, Kotlin classes are final: they can’t be inherited.
// To make a class inheritable, mark it with the open keyword.
open class User(var firstName: String, var lastName: String, var age: Int){
    //var name: String = name
    //var age: Int = age

    //Secondary Constructor
//    constructor(name: String, age: Int, lastName: String): this(name, age){
//        this.name = name + lastName
//    }
    var name: String
        get() = firstName +" "+ lastName
        set(value) {
            val fullName = value.split(" ")
            firstName = fullName[0]
            lastName = fullName[1]
        }
    //     The init block is always called after the primary constructor
    //    A class file can have one or more init blocks executing in serie
    init {
        if (age == 0){
            println("umur tidak boleh kosong")
        }
    }
}
// Inheritance
class Teacher(firstName: String, lastName: String, age: Int, var subject: String): User(firstName, lastName, age){

}
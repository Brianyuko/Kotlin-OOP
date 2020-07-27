// Object Oriented Programming

// class NameClass (Constructor)
class User(var firstName: String, var lastName: String){
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
}
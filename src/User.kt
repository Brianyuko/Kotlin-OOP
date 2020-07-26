// Object Oriented Programming

// class NameClass (Constructor)
class User(var name: String, var age: Int){
    //var name: String = name
    //var age: Int = age

    //Secondary Constructor
    constructor(name: String, age: Int, lastName: String): this(name, age){
        this.name = name + lastName
    }
}
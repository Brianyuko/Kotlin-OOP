fun main(){
    // NameClass(Set Value)
    val person1 = User("Robi", "50", 0)
    // Setter Name
    person1.name = "Ahmad dimas"
    //val person2 = User("Makmur", 20, " Jaya")
    //println("Nama saya: ${person1.name}\nUmur: ${person1.age} ")
    //println("Nama saya: ${person2.name}")
    val person3 = User("Robi", "Purba", 20)
    person3.name = "Ahmad Santoso"
    println("Nama saya ${person3.name} umur ${person3.age}")
    // Teacher Object
    val teacher1 = Teacher("Pak", "Toton", 20, "Pengantar sistem informasi")
    println("Nama: ${teacher1.name}\nMatkul: ${teacher1.subject} ")
    teacher1.breakTime()
    val student1 = Student("Ahmad", "Bayu", 19, "Semester 3")
    println("Nama: ${teacher1.name}\nMatkul: ${student1.grade} ")
    student1.breakTime()

    // Extension Function
    fun String.addToken() : String {
        return "Bearer $this"
    }
    val testing = "this is this"
    println(testing.addToken())

    // Extension function Class
    val a = People()
    println(a.cekAngka(10))
}
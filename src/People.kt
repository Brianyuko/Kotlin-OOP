// Nested AND Inner Class
// Outer Class
class People {
    private val nama: String = "Agus"
    // Nested Class
//    class UserName{
//        fun getName(){
//            println(nama) -> unresolved, bcs nama private val
//        }
//    }
    fun cekAngka(x:Int) : Boolean{
        return x>10
    }
    // Inner class can access private scope
    inner class UserName {
        fun getName(){
            println(nama)
        }
    }
}
fun main(){
    People().UserName().getName()
}
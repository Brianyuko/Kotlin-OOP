enum class Member(val type: String){
    NEWBIE("gray"){
        override fun show(){
            println("Tipe member kamu adalah $type")
        }
    },
    ELITE("silver") {
        override fun show() {
            println("Tipe member kamu adalah $type")
        }
    },
    EXCLUSIVE("gold") {
        override fun show() {
            println("Tipe member kamu adalah $type")
        }
    };

    // Anonymous Class
    abstract fun show()
}
fun main(){
    Member.ELITE.show()
    Member.EXCLUSIVE.show()
}
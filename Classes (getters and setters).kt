class Userss(firstname : String, var lastname : String = "LastName", var age : Int = 0){
    var firstname = firstname
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

fun main(){


val user1 = Userss("Mary", "Anne", 18)


}
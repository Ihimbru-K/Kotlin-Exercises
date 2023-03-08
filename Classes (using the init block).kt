

fun main(args: Array<String>){
    /*
    A value can be assigned to a property inside init blocks
    after some sort of validation is done
     */
    val user = User("Kanyimi", "Ihimbru", 21)
}
class User(name : String, var lastname : String, var age : Int) //name is changed from variable to parameter
var name = ""//the value is not assigned directly
init {
    if (name.lowercase().startsWith("a")){
        this.name = name
    }else{
        this.name = "User"
        println("Name doesn't start with the letter 'A' or 'a' ")
    }
}


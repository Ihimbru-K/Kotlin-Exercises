class User(name : String, var lastname : String, var age : Int){
    var name : String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("The name does not start with the letter 'a' or 'A'")
        }

    }
}

fun main(args : Array<String>){

    val user = User("Andrea", "Bih", 23)
    val friend = User("Ihims", "Kboy", 22)

    



}
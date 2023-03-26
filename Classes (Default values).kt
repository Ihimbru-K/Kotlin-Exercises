
/**
 * When default values are being used, secondary constructors are not needed
 * */
fun main (){
    val user = Userrs("Mary", "Anne", 30)
    val user2 = Userrs("Che", "Bih")
    val user3 = Userrs(age = 25, name = "Ivanka", lastname = "laurine") //named arguments : value passed to property in any order just like in functions
//named arguments can only be used in primary constructors


    println("Name : ${user.name}")
    println("lastname : ${user.lastname}")
    println("age : ${user.age}")

    println("\n")
    println("Name : ${user2.name}")
    println("lastname : ${user2.lastname}")
    println("age : ${user2.age}")

    println("\n")

    println("Name : ${user3.name}")
    println("lastname : ${user3.lastname}")
    println("age : ${user3.age}")


}


class Userrs(var name : String, var lastname : String = "LastName", var age : Int = 0){ //default names are being given to the variables lastname and age




}
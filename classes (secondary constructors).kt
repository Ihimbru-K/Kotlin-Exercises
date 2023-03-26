/*
Secondary constructors declare parameters and not properties
they can be used when an object doesn't make use of all the
attributes of its class
 */
/**
 * The secondary constructor calls the values of the primary constructor
 * It is declared using the constructor() method
 * */


fun main (){
    val user = Userrs("Mary", "Anne", 30)
    val user2 = Userrs("Che", "Bih")
    val user3 = Userrs("Paul")



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




    var myPhone = phone("Oppo", 4, 32)
    myPhone.DisplayParameters()


}


class Users(var name : String, var lastname : String, var age : Int){
    /*The secondary constructor takes parameters and calls properties of the primary constructor
     */


    //object created takes only name as attribute
    constructor(name: String) : this(name, "LastName", 0){
        println("first secondary constructor")  // a secondary constructor can have some code in it
    }

    //object will have only first and last names, no age.
    constructor(name: String, lastname : String) : this(name, lastname, 0){
        println("Second secondary constructor")
    }

}








class phone(var Brand : String, var RAM : Int, var storageSpace : Int){
    constructor(Brand : String, RAM : Int) : this(Brand, RAM, 0)

    fun DisplayParameters(){
        print("Characteristics : Brand : ${this.Brand}, RAM : ${this.RAM}, Storage : ${this.storageSpace}")
    }
}

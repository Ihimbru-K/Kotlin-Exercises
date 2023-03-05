/**
 * A class is a modifiable program template for an object
 * It has characteristics (attributes) and behaviours (called methods which are functions declared in classes)
 * An interface is a structure that enhances certain behaviours of a class
 * An object is an instance of a class possessing its own unique state
 */
fun main(){
    class Person{

        //attributes
        var age : Int = 0
        var name : String = ""
        var height : Float = 0.0F

        //methods
        fun sleep() : Boolean = true
        fun drink(){
            println("Humans drink water everyday")
        }

    }

    val kboy = Person()
    kboy.age = 21
    kboy.name = "Ihimbru"
    kboy.height = 1.7F

    println(kboy.sleep())

}
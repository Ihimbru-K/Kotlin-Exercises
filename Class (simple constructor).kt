 /* Below is a constructor which takes an integer parameter and initializes
     a read-only property named brand of type string
     */
    class Car(val brand : String) // by default, access to the class and its members is public

    //creating an instance
    val car = Car("Mercedes")
    println(car.brand)
    
    
    
fun main(){
   


    class Boy(val age : Int)

    val kboy = Boy(21)
    println(kboy.age)


    class Rectangle(var length : Int, val width : Int)

    val rect = Rectangle(3,5)
    println(rect.length)
    rect.length = 33
    println(rect.length)






}

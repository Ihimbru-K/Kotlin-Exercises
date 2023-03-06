fun main(){
    /* Below is a constructor which takes an integer parameter and initializes
     a read-only property named brand of type string
     */
    class Car(val brand : String) // by default, access to the class and its members is public

    //creating an instance
    val car = Car("Mercedes")
    println(car.brand)


}
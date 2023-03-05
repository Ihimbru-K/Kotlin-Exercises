fun main(){
    class Car(var brand : String, var model : String, var year : String){
        fun MaxSpeed(x : Int) = println("Maximum speed is $x")
        fun Drive() = println("vrooom")
    }

    val car = Car("Ford","Mustang", "1961")
    car.MaxSpeed(455)
    car.Drive()
}
import kotlin.time.measureTimedValue

  class Car(val yearMade : Int, theColor : String)
      var FuelLevel = 100

    var color = theColor
    set(value)
        if(value.isBlank()){
        throw RuntimeException("no empty value, please")
    }
    field = value
    init {
        if(yearMade < 2020){ FuelLevel = 90}
    }

/*
Within the init block we change the value of fuelLevel based on the value of
yearOfMake. Since this requires access to fuelLevel, it can’t be earlier than the
declaration of fuelLevel
 */

fun main (){
  

}

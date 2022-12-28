fun main(){
    /*reads A string representation of a number and convert to other types
    and prints results*/
    val someString = "800.1234567" //read string 

    val d = someString.toDouble()
    val f = d.toFloat()
    val g = f.toInt()
    val b = g.toByte()

    println(d)
    println(f)
    println(g)
    println(b)
    println(someString.toBoolean())

}
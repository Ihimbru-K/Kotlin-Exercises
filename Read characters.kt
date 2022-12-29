fun main(args: Array<String>) {
    
    //reading two characters and comparing them
    val c1 = readln().first()
    val c2 = readln().first()

    println(c1.equals(c2, ignoreCase = true))
}
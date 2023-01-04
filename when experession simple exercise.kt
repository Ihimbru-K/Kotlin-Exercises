fun main(){
    /**
     * The programme below performs addition, subtraction and multiplication of
     * two integer numbers. It uses when to decide what operation to perform
     */
    val (var1, op, var2) = readln().split("")
    val a = var1.toInt()
    val b = var1.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println( a * b)
        else -> println("unknown number")
    }
}
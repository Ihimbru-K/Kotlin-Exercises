fun main(args: Array<String>) {
   /*
   checking whether a value belongs to a
   range using when
    */
    println("Enter a number")
    val n = readln().toInt()

    when (n) {
        0 -> println("n is zero")
        in 1..1000 -> println("number is between 1 and 1000 (inclusive)")
        in 1000..10000 -> println("number is between 1000 and 10000 (inclusive)")
        else -> println("n is outside a range")
    }
}
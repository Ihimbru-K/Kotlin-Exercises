fun main (){
    // a..b is the range of numbers starting from a to b
    println(5 in 5..15) //true
    println(12 in 5..15) //true

    //excluding the right border by subtracting 1 from it
    val withinExclRight = c in a..b-1 // a <= c && c < b

    //checking whether a value is not in the range
    val notWithin = 100 !in 10..99 //true

    //using ranges of characters and strings
    println('b' in 'a'..'c') //true
    println('k' in 'a'..'e') //false
    println("hello" in "he".."hi") //true
    println("abc" in "aab".."aac") //false
}
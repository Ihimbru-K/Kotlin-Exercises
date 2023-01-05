fun main(){
   /*
   when can also return a result. In this case,
   every branch should return something, and an
   else branch is required. In the code below,
   every branch returns a result of the corresponding operation
    */
    val (var1, op, var2) = readln().split("")
    val a = var1.toInt()
    val b = var2.toInt()
    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> "Unknown operator"
    }
    println(result)

}
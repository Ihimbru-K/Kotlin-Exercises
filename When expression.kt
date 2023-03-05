fun main (args: Array<String>){
    /*
    Kotlin provides a special when expression to perform different actions depending on the value
    of a variable. It can replace if and make code more readable.
    The program below performs addition, subtraction, and multiplication of two integers.
    It uses when to decide which operation to perform
     */
    val(var1, op, var2) = readln().split("")

    val a = var1.toInt()
    val b = var1.toInt()

    when(op){
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }


    /**
     * Case: if there are several cases to handle
     * A comma can be used to combine various cases as seen below
    */
    when(op){
        "+", "plus" -> println(a + b)
        "-", "minus" -> println(a -b)
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
    }

    /**
     * Complex blocks with multiple statements as branches can be used
     */

    when(op) {
        "+", "plus" -> {
            val sum = a + b
            println(sum)
        }

        "-", "minus" -> {
            val diff = a - b
            println(diff)
        }

        "*", "times" -> {
            val product = a * b
            println(product)
        }

        else -> println("Unknown operator")
    }





    /**
     * When as an expression
     * Every branch returns something, and an else branch is required
     * */

    val  result = when(op){
        "+","plus" -> a + b
        "-","minus" -> a - b
        "*", "times" -> a * b
        else -> "unknown operator"
    }
    println(result)


    /**
     * When without arguments
     * In this case, every branch condition is a simple boolean expression
     * A branch is executed when its condition is ture.
     * If several conditions are true, only the first one will be executed
     */

    val n = readln().toInt()

    when{
        n == 0 -> println("n is equal to 0")
        n in 1..100 -> println("n is between 1 and 100")
        n > 300 -> println("n is greater than 300")
        //else branch is optional here
    }

}
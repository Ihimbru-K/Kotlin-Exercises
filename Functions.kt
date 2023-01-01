/**
 * a function is a sequence of instructions grouped together to perform a specific task
 * It can be invoked by calling its name
 * It is an expression that has a body, parameters and a return value
 */

fun main(){
    /** declaring a function
    //p1 and p2 are parameters of same or diff types (Int,bool,...) there can be one or many parameters
    fun functionName(p1: Type1, p2, type2, ...) :ReturnType{
        body         //statements which define a function
        return result
    }
    */


    /**
     * defining a simple function that calculates the sum of integer numbers and returns it
    NB: The arguments of a function can be accessed only in the function
    */

    fun sum(a: Int, b: Int) : Int{
        return a + b
    }
    println(sum(2,4))



    /**
     * Single expression functions return a single expression
     * These functions can be written without curly braces
     */
    fun sum1(x: Int, y: Int) : Int = x + y //return type specified explicitly
    fun sum3(i: Int, j: Int) = i + j //return type not specified

    println(sum1(34,22))





}
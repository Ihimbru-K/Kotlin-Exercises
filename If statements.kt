fun main (Args: Array<String>){
    /*declaring a function which compares two
    numbers and returns the greatest*/
    fun Compare(a: Int , b: Int) :Int{ //f
        return if(a>b) a else b //if a is greater than b it returns a else b
    }
    print("Enter first number: ")
    val x = readln().toInt() //reads first value from input as a string and converts it to an integer
    print("Enter second number: ")
    val y = readln().toInt()
    println("Greatest number is ${Compare(x, y)}")

/* This is a second approach to declare the same function
* above. '=' is used in the place of return and it
* automatically returns Integer values just as the input
* parameters*/
    fun Compare2(c: Int, d: Int) =if(c>d) c else d
    println(Compare2(4,5))  //output will display 5
}
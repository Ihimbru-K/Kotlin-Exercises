fun main(){
    //reading a number from input, converting it to an integer and printing it
    println("Print any number: ")
    val number = readln().toInt()
    print("you printed the number: ${number}")

    //Reading multiple values in one line

    //reading 2 values and printing them
    val (a,b) = readln().split("")
    println(a)
    println(b)

    // reading 5 values and printing them
    val (e,f,g,h,i) = readln().split("")
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)

}
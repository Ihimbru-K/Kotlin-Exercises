//import java.util.*
import java.util.Scanner

fun main(args: Array<String>) {
        print("Enter a number and a measure: ")
        val scanner = Scanner(readln())
        val a = scanner.nextInt() //reads the integer part of input
        val b = scanner.next().toLowerCase() //reads string part of input
        val meters = a*1000 //converts b (in km) to meters



        if (a > 1 && (b == "km" || b == "kilometer" || b == "kilometers")){
            println("$a kilometers is $meters meters")
        }
        else if (a == 1 && (b == "km" || b == "kilometer" || b == "kilometers")){
            println("$a kilometer is $meters meters")
        }
        else {
            println("Wrong input")
        }
}
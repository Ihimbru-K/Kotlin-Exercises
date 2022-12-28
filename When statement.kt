//when is much like a series of if-else that can handle many cases
fun main(){
    println("What was the time ? ")
    val time = readln() //reads time from input among options in when clause
    when (time)
    {
        "7am" -> println("Go to school")
        "3pm" -> println("Be back from school")
        "4:30" -> println("Cook, eat and rest")
        "7pm" -> println("Study time")
        "10pm" -> println("Go to sleep")

        else -> println("Do any other thing")
    }

}
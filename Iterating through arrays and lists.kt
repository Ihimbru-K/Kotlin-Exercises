fun main(Args : Array<String>){
    val students = arrayOf("Peter", "Paul", "Matthew")
    for(i in students) {
        println(i)
    }

    val numbers = listOf(1,2,4,6,7)
    for(i in numbers){println("$i, ")}

    println(numbers.indices)

    for(index in numbers.indices){
        println("position of ${numbers.get(index)} is $index")
    }
}
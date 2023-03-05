fun main(){
    /*
    An array is a data structure consisting of elements stored in consecutive
    locations adjacent to each other
     */

/*The set of indices in an array starts with the index, 0, and
progresses with an increment of 1.*/
    val people = arrayOf("Kanyimi","Peter","Marlyse") //created using the arrayOf() library method
    println(people[0]) //first element (kboy)'

    // elements can be accessed using [] or get() method
    println(people[2])
    println(people[2])

    people[0] = "Melissa" //Replacing element at index 0 (first element) with "Melissa
    println(people[0])

    println(people.size) //length of array

}
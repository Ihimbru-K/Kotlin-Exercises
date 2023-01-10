fun main(){
    /* A string is a sequence of zero or more
    characters enclosed by double quotes e.g. "John","".
     */

    //length of a string

    val language = "kotlin"
    println(language.length)

    //length of the empty string
    val empty = ""
    println(empty.length)


    //concatenation of two strings.
    /* when two strings are concatenated (added),
    a new string is created
    strings can be concatenated using the + */
    val str1 = "b"
    val str2 = "oy"
    val result = str1 + str2
    println(result)


    /*Appending (adding values) to strings using +
    characters and strings can be concatenated to give
    a string */
    val code = "123" + 456  + "789"
    println(code)

    //repeating a string two or more times
    println("Hello".repeat(4))
    println("Eat. Sleep. Code. Repeat. \n".repeat(7)) // \n gives a new line

    /*raw string is one which contains special symbols
    like tabs or quote marks */
    val largeString = """
        I am learning kotlin
            Here I have used a tab
        He said: "I am hungry!"
    """.trimIndent() //removes first and last lines and trims indents


}
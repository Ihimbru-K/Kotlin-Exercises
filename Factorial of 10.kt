fun main() {
    fun fact(num: Int): Int {
        return if (num == 1) 1 else num * fact(num - 1)
    }
    println(fact(10))

}

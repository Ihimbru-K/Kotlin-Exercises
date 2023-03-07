fun main(){
    fun findMax(numbers : Array<Int>) : Int {
        var min = numbers[0]

        for (i in numbers) {
            min = if (i > min) min else i
        }
        return min
    }

    fun findMin(num : Array<Int>) : Int {
        var max = num[0]

        for (i in num){
            max = if(i > max) i else max
        }
        return max
    }


    println(findMax(arrayOf(1,2,3,4,4,4,42)))
    println(findMin(arrayOf(1,2,3,4,90,23)))
}
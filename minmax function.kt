fun FindMinAndMax(numbers : IntArray, SearchMax : Boolean) : Int {
    var max = numbers[0]
    var min = max

    if(SearchMax){
        for (i in numbers){
            max = if(i > max) i else max
        }
        return max
    }

    else{
        for(i in numbers){
            min = if(i < min) i else min
        }
        return min
    }

}

fun main(){

    println(FindMinAndMax(intArrayOf(1,2,3,90,9000,15000), true))
    println(FindMinAndMax(intArrayOf(60,90,12,10,100,150), false))



}
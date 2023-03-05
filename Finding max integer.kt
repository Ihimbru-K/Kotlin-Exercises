fun main(){
  fun maximum(arr : IntArray) : Int {
      var largest = Int.MAX_VALUE
      for(i in arr){
          largest = if( i > largest) i else largest
      }
      return largest
  }

    println(maximum(intArrayOf(1,2,3,4,5,5,55)))
}


fun main(){
    var sum = 0
    for(i in 10..30){
        if(i % 2 == 0){
            sum += i
        }
    }
    print(sum)
}
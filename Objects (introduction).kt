fun main(){
    /*
    * the most rudimentary object expression is useful only to group a
few local variables together
    * */

    fun drawCircle(){
        val circle = object{
            val x = 10
            val y = 40
            val r = 50
        }
        println("Circle x:${circle.x}, y:${circle.y}, radius : ${circle.r}")
    }
    drawCircle()
}
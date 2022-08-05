fun main() {
    var min = 1
    var max = 0 
    val n = readLine()!!.toInt()
    if(n == 1){
        println(min)
    } else {
        repeat(n) {
            var num = readLine()!!.toInt()
            if(num >= min) {
                min = num
                max++
            }
        }
        println(max)
    }

}

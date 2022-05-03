fun main() {
    var num = 0
    do {
        val i = readLine()!!.toInt()
        num = i + num 
    } while (i > 0)
    println(num)
}

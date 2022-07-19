const val ZERO = 0
fun main() {
    var positev = 0
    repeat(readLine()!!.toInt()) {
        val num = readLine()!!.toInt()
        if (num > ZERO) positev++
    }
    println(positev)
}

fun main() {
    var sum: Int = 0
    val n = readLine()!!.toInt()
    repeat(n) {
        val input = readLine()!!.toInt()
        sum += input
    }
    println(sum)
}

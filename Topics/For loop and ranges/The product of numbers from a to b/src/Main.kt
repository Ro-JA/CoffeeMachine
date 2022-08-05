const val TWO = 2
fun main() {
    var result: Long = 1
    val(a, b) = List(TWO) { readLine()!!.toLong() }
    for (i in a until b) {
        result *= i
    }
    println(result)
}

const val FIVE = 5
fun main() {
    val(a, b, c, d, e) = List(FIVE) { readLine()!!.toInt() }
    println(if (e in a..b && e in c..d) "true" else "false")
}

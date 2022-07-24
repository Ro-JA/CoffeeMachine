const val BIGINER = 18
const val OLD = 59
fun main() {
    val work = readLine()!!.toInt()
    println(if (work in BIGINER..OLD) "true" else "false")
}

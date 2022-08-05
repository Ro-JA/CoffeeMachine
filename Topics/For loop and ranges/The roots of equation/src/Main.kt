const val RANGE = 0
const val RANGE_VALUE = 1000
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    for (x in RANGE..RANGE_VALUE) {
        if (a * (x * x * x) + b * (x * x) + c * x + d == 0) {
            println(x)
        }
    }

}

const val THREE = 3
fun main() {
    val(a, b, c) = List(THREE) { readLine()!!.toInt() }
    println(if (a in b..c) "true" else "false")
}

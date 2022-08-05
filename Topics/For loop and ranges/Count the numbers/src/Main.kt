const val THREE = 3
fun main() {
    var c = 0
    val(a, b, n) = List(THREE) { readLine()!!.toInt() }
    for (i in a..b) {
        if (i % n == 0) {
            c++
        }
    }
    println(c) 
}

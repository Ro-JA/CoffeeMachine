const val TWO = 2
fun main() {
    val(a, b) = List(TWO) { readLine()!!.toInt() }
    var c = 0
    for (i in a..b) {
        c += i
    }
    println(c) 
}

const val ZERO = 0
const val POSITEVI = 1
const val NEGATIVE = -1
const val THREE = 3
fun main() {
    var(a, b, c) = List(THREE) { ZERO }
    val n = readLine()!!.toInt()
    repeat(n) {
        when (readLine()!!.toInt()) {
            ZERO -> a++
            POSITEVI -> b++
            NEGATIVE -> c++
        }
    }
    println("$a $b $c")
}

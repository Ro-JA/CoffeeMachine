const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val ZERO = 0
fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var(a, b, c, d) = List(FOUR) { ZERO }
    repeat(n) {
        when (readLine()!!.toInt()) {
            TWO -> d++
            THREE -> c++
            FOUR -> b++
            FIVE -> a++
        }
    }
    println("$d $c $b $a")
}

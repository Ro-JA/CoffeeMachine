const val TWO = 2
const val THREE = 3
const val FIVE = 5
const val FIFTEEN = 15

fun main() {
    val(start, end) = List(TWO) { readLine()!!.toInt() }
    for (i in start..end) {
        val output = when {
            i % FIFTEEN == 0 -> "FizzBuzz"
            i % THREE == 0 -> "Fizz"
            i % FIVE == 0 -> "Buzz"
            else -> i.toString()
        }
        println(output)
    }
}

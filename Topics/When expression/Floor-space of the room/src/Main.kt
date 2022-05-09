import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println(
        when (readln()) {
            "triangle" -> {
                val (a, b, c) = List(3) { readln().toDouble() }
                sqrt(
                    ((a + b + c) / 2) * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) *
                            ((a + b + c) / 2 - c)
                )
            }
            "rectangle" -> {
                val (a, b) = List(2) { readln().toDouble() }
                a * b
            }
            "circle" -> 3.14 * readln().toDouble().pow(2)
            else -> 0.00
        }
    )
}






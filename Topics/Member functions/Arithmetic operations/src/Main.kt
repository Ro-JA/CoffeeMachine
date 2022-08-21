import kotlin.math.abs

class ArithmeticOperation(val x: Int, val y: Int) {
    fun addition() = y + x
    fun subtraction() = abs(y - x)
    fun  multiplication() = x * y
    fun division() = x / y
}
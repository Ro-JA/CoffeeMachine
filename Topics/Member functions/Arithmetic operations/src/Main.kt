import kotlin.math.abs

class ArithmeticOperation(var x: Int, var y: Int) {
    fun addition() = y + x
    fun subtraction() = abs(x - y)
    fun  multiplication() = x * y
    fun division() = x / y
}

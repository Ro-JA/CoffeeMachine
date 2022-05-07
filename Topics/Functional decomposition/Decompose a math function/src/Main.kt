import kotlin.math.pow

fun f(x: Double): Double = when {
    x <= 0 -> f1(x)
    x < 1 -> f2(x)
    else -> f3(x)
}

fun f3(x: Double): Double = x.pow(2.0) - 1

fun f2(x: Double): Double = 1 / x.pow(2.0)

fun f1(x: Double): Double = x.pow(2.0) + 1

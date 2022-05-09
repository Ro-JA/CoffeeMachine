fun main() {
    val input = readln()
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    when(input) {
        "triangle" -> funTriangle(a, b, c)
        "rectangle" -> funRectangle(a, b)
        "circle" -> funCircle(pi = 3.1415926535, a)
    }
}

fun funCircle(pi: Double = 3.1415926535, a: Double ) = pi * a * a

fun funRectangle(a: Double, b: Double) = a * b

fun funTriangle(a: Double, b: Double, c: Double) = ((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b)
    * ((a + b + c) / 2 - c))



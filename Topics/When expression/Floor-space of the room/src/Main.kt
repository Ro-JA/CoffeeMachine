fun main() {
    val input = readln()

    when(input) {
        "triangle" -> funTriangle()
        "rectangle" -> funRectangle()
        "circle" -> funCircle()
    }
}

fun funCircle() {
    val pi = 3.14
    val a = readln().toDouble()
    println(pi * a * a)
}

fun funRectangle() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    println(a * b)
}

fun funTriangle() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    println(
        kotlin.math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b)
                * ((a + b + c) / 2 - c))
    )
}



fun main() {
    val (var1, op, var2) = readln().split(" ")
    val a = var1.toLong()
    val b = var2.toLong()
    if (b > 0) {
        when (op) {
            "+" -> println(a + b)
            "-" -> println(a - b)
            "/" -> println(a / b)
            "*" -> println(a * b)
            else -> println("Unknown operator")
        }
    } else {
        println("Division by 0!")
    }
}
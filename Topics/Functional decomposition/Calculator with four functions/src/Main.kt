// Implement your functions here

fun subtractTwoNumbers(a: Long, b: Long) = a - b


fun sumTwoNumbers(a: Long, b: Long) = a + b


fun divideTwoNumbers(a: Long, b: Long) {
    if (b.toInt() == 0) {
        println("Division by 0!")
    } else {
        a / b
    }
}


fun multiplyTwoNumbers(a: Long, b: Long) = a * b
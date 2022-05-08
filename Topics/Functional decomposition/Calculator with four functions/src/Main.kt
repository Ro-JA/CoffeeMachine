// Implement your functions here

fun subtractTwoNumbers(a: Long, b: Long) = a - b


fun sumTwoNumbers(a: Long, b: Long) = a + b


fun divideTwoNumbers(a: Long, b: Long): Long {
    var result= 0L
    if (b.toInt() == 0) {
        println("Division by 0!")
    } else {
        result = (a / b)
    }
    return result
}


fun multiplyTwoNumbers(a: Long, b: Long) = a * b
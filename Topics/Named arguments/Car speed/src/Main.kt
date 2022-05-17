const val N = 60
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val n1 = readLine()!!
    if (n1 == "no limit") {
        speedCheek(n, n1 = N)
    } else {
        speedCheek(n, n1.toInt())
    }
}

fun speedCheek(n: Int, n1: Int) {
    if (n <= n1) {
        println("Within the limit")
    } else {
        println("Exceeds the limit by ${n - n1} kilometers per hour")
    }
}
fun main() {
    var a = 0
    do {
        val n = readLine()!!.toInt()
        if (n > a) {
            a = n
        }
    } while (n > 0)
    println(a)
}

fun main() {
    val n = readLine()!!.toInt()
    var i = 1
    do {
        println(i * i)
        i += 1
    } while (n >= i * i)
}

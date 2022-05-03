fun main() {
    var a = 1
    var b = 1
    val n = readLine()!!.toInt()
    repeat(n) {
        while (a <= b) {
            a++
            b++
           print(b) 
        }
    }
}

fun main() {
    var l = mutableListOf<Int>()
    var min = 1
    var max = 1
    var m = mutableListOf<Int>()
    val n = readLine()!!.toInt()
    repeat(n) {
        val i = readLine()!!.toInt()
        l.add(i)
    }
    for (i in l) {
        if (i >= min) {
            max += 1
            min = i
        } else {
            m.add(max)
        }
    }
    println(m.maxOrNull())
}

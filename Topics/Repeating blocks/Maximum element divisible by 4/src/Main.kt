const val FOUR = 4
fun main() {
    val listNum: MutableList<Int> = mutableListOf(0)
    repeat(readLine()!!.toInt()) {
        val num = readLine()!!.toInt()
        if (num % FOUR == 0) {
            listNum.add(num)
        } 
    }
    println("${listNum.maxOrNull()}")
}

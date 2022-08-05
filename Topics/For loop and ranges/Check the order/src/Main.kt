fun main() {
    val nums = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(if (nums == nums.sorted()) "YES" else "NO")
}

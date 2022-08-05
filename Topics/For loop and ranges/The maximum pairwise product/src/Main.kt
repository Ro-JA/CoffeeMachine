fun main() {
    val nums = List(readLine()!!.toInt()) { readLine()!!.toInt() }.sortedDescending()
    val first = nums[0]
    val second = nums.getOrNull(1)
    if (second == null) {
        println(first)
    } else {
        println(first * second)
    }
}

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

data class ByteTimer(var time: Int) {
    init {
        time = when (true) {
            time < Byte.MIN_VALUE.toInt() -> Byte.MIN_VALUE.toInt()
            time > Byte.MAX_VALUE.toInt() -> Byte.MAX_VALUE.toInt()
            else -> time
        }
    }
}

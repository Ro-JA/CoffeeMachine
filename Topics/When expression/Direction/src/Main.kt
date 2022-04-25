const val UP = 1
const val DOWN = 2
const val LEFT = 3
const val RIGHT = 4
const val NO_MOVE = 0


fun main() = print(
    when (readLine()!!.toInt()) {
        NO_MOVE -> "do not move"
        UP -> "move up"
        DOWN -> "move down"
        LEFT -> "move left"
        RIGHT -> "move right"
        else -> "error!"
    }
)
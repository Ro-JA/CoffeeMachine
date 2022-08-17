fun main() {
    val word = readLine()!!
    val repWord = word.length
    println("$repWord repetitions of the word $word: ${"$word".repeat(repWord)}")
}

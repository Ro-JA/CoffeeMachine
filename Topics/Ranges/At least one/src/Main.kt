fun main() {
    val inputOne = readLine()!!.toInt()
    val inputTwo = readLine()!!.toInt()
    val inputTree = readLine()!!.toInt()
    val inputFour = readLine()!!.toInt()
    val inputFive = readLine()!!.toInt()
    println(inputFive in inputOne..inputTwo || inputFive in inputTree..inputFour)
}
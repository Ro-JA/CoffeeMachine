package machine

fun main() {
    println(
        """
Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!
        
    """
    )
    howManyCups()
}

fun howManyCups() {
    val water = 200
    val milk = 50
    val beans = 15
    println("Write how many cups of coffee you wil need")
    val cups = readLine()!!.toInt()
    println("For $cups cups of coffee you will need:")
    println("${water * cups} ml of water")
    println("${milk * cups} ml of milk")
    println("${beans * cups} g of coffee beans")


}

fun minCups() {
    println("Write how many ml of water the coffee machine has:")
    val waterUser = readLine()!!.toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milkUser = readLine()!!.toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beansUser = readLine()!!.toInt()
    println("Write how many cups of coffee you will need:")
    val cupsUser = readLine()!!.toInt()
    if (waterUser > 200 * cupsUser)

}

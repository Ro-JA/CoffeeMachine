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
    minCups()
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
    val waterUser = readLine()!!.toInt() / 200
    println("Write how many ml of milk the coffee machine has:")
    val milkUser = readLine()!!.toInt() / 50
    println("Write how many grams of coffee beans the coffee machine has:")
    val beansUser = readLine()!!.toInt() / 15
    println("Write how many cups of coffee you will need:")
    val cupsUser = readLine()!!.toInt()
    val cupsInMachine = listOf<Int>(waterUser, milkUser, beansUser).minOrNull()
    if (cupsUser == cupsInMachine) {
        println("Yes, I can make that amount of coffee")
    } else if (cupsUser > cupsInMachine!!) {
        println("No, I can make only $cupsInMachine cups of coffee")
    } else if (cupsUser < cupsInMachine) {
        println("Yes, I can make that amount of coffee (and even ${cupsInMachine - cupsUser} more than that)")
    }

}

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
    val water = readLine()!!.toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = readLine()!!.toInt()
}

package machine

const val WATER_CUP_ESPRESSO = 250
const val WATER_CUP_LATTE = 350
const val WATER_CUP_CAPPUCCINO = 200
const val WATER_CUP = 200
const val MILK_CUP_LATTE = 75
const val MILK_CUP_CAPPUCCINO = 100
const val MILK_CUP = 50
const val BEANS_CUP_ESPRESSO = 16
const val BEANS_CUP_LATTE= 20
const val BEANS_CUP_CAPPUCCINO = 12
const val BEANS_CUP = 15
const val PRICE_ESPRESSO = 4
const val PRICE_LATTE = 7
const val PRICE_CAPPUCCINO = 6
const val WATER = 400
const val MILK = 540
const val BEANS = 120
const val MONEY = 550
const val CUPS = 9


fun main() {

   startCoffeeMachine()
}

fun coffeeProcessText() {
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
}

fun ingredientCalculatorCoffee() {

    println("Write how many cups of coffee you wil need")
    val cups = readLine()!!.toInt()
    println("For $cups cups of coffee you will need:")
    println("${WATER_CUP * cups} ml of water")
    println("${MILK_CUP * cups} ml of milk")
    println("${BEANS_CUP * cups} g of coffee beans")


}

fun numberOfServings() {
    println("Write how many ml of water the coffee machine has:")
    val waterUser = readLine()!!.toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milkUser = readLine()!!.toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beansUser = readLine()!!.toInt()
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

fun startCoffeeMachine() {
    println("""
        The coffee machine has:
        $WATER ml of water
        $MILK ml of milk
        $BEANS g of coffee beans
        $CUPS disposable cups
        ${'$'}$MONEY of money

        Write action (buy, fill, take): 
    """.trimIndent())

    val active = readLine()
    when(active) {
        "buy" -> buyCoffe()
        "fill" -> fillCoffeeMachine()
        "take" -> takeMoney()
        else -> println("Write action (buy, fill, take):")
    }
}

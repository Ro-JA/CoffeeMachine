package machine

import java.lang.System.exit
import java.lang.System.runFinalization
import kotlin.system.exitProcess

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
var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550



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
    println("Write action (buy, fill, take, remaining, exit):")

    val action = readLine()
    when(action) {
        "buy" -> buyCoffee()
        "fill" -> fillCoffeeMachine()
        "take" -> takeMoney()
        "remaining" -> remainingIngredient()
        "exit" -> runFinalization()
           else -> startCoffeeMachine()
    }
}

fun remainingIngredient() {
    println("""
          The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $cups disposable cups
        ${'$'}$money of money
    """.trimIndent())
    startCoffeeMachine()
}

fun takeMoney() {
    println("I gave you ${'$'}$money")
}

fun fillCoffeeMachine() {
    println("Write how many ml of water do you want to add:")
    val addWater = readLine()!!.toInt()
    println("Write how many ml of milk do you want to add:")
    val addMilk = readLine()!!.toInt()
    println("Write how many grams of coffee beans do you want to add:")
    val addBeans = readLine()!!.toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    val addCups = readLine()!!.toInt()
    println("""
        The coffee machine has:
        ${water + addWater} ml of water
        ${milk + addMilk} ml of milk
        ${beans + addBeans} g of coffee beans
        ${cups + addCups} disposable cups
        ${'$'}$money of money
    """.trimIndent())

}

fun buyCoffee() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    when(readLine()!!.toInt()) {
        1 -> if (water > WATER_CUP_ESPRESSO && beans > BEANS_CUP_ESPRESSO && cups > 1) {
            println("I have enough resources, making you a coffee!")
            water -= WATER_CUP_ESPRESSO
            beans -= BEANS_CUP_ESPRESSO
            cups --
        } else {
            if (water < WATER_CUP_LATTE) {
                println("Sorry, not enough water!")
            } else if (beans < BEANS_CUP_ESPRESSO) {
                println("Sorry, not enough beans")
            } else {
                println("Sorry, not enough cups")
            }
        }
        2 -> if (water > WATER_CUP_LATTE &&)
    }
}

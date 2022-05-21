// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var price = 8000
    if(old != 5) {
        price -=(old - 5) * 200
    }
    if (kilometers != 100000) {
        price += 100000 - kilometers / 10000 * 200
    }
    if (maximumSpeed != 120) {
        price -= 120 - maximumSpeed * 100
    }
    if (automatic) {
        price += 1500
    }
    println(price)
}
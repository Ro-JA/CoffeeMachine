const val FIVE = 5

class Car(val make: String, val year: Int) {
    var speed: Int = 0
    fun accelerate() {
        speed += FIVE
    }

    fun decelerate() {
        if (speed > FIVE) {
            speed -= FIVE
        } else {
            speed = 0
        }
    }
}
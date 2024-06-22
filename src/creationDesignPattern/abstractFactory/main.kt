package src.creationDesignPattern.abstractFactory

fun main() {
    val choice = (1..3).random()
    val product = Product("Laptop And Book", price = 1300, deliveryType = null)
    val logistic: Logistics = when(choice) {
        1 -> TruckLogistic()
        2 -> AirplaneLogistic()
        3 -> ShipLogistic()
        else -> throw IllegalArgumentException("Invalid choice")
    }
    val application = Application(logistic = logistic)
    println(application.deliver(product))

}
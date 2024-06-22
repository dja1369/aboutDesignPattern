package src.creationDesignPattern.factoryMethod

fun main() {
    val choice = (1..4).random()
    val product = Product("Laptop", price = 1000, deliveryType = null)
    val logistics: Logistics = when(choice) {
        1 -> TruckLogistic()
        2 -> AirplaneLogistic()
        3 -> ShipLogistic()
        else -> throw IllegalArgumentException("Invalid choice")
    }
    println(logistics.planDelivery(product))
}
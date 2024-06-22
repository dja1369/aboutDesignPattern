package src.creationDesignPattern.factoryMethod

class AirPlane: Transport{
    override fun deliver(product: Product): Product {
        return product.apply {
            deliveryType = "Delivery by AirPlane"
            price += 1000
        }
    }
}
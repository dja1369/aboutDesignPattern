package src.creationDesignPattern.factoryMethod

class Truck: Transport{
    override fun deliver(product: Product): Product {
        return product.apply {
            deliveryType = "Delivery by Truck"
            price += 300
        }
    }
}
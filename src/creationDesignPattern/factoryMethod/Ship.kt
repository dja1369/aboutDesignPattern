package src.creationDesignPattern.factoryMethod

class Ship: Transport {
    override fun deliver(product: Product): Product {
        return product.apply {
            deliveryType = "Delivery by Ship"
            price += 100
        }
    }
}
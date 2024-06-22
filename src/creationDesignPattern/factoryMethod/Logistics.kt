package src.creationDesignPattern.factoryMethod

abstract class Logistics {
    fun planDelivery(product: Product): Product {
        val transport = createTransport()
        return transport.deliver(product)
    }

    abstract fun createTransport(): Transport
}
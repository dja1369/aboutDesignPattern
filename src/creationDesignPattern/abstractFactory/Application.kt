package src.creationDesignPattern.abstractFactory

class Application(logistic: Logistics) {
    private var logistic: Transport = logistic.createTransport()

    fun deliver(product: Product) = logistic.deliver(product)

}
package src.creationDesignPattern.abstractFactory

fun interface Transport {
    fun deliver(product: Product): Product
}
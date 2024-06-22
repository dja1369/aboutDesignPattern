package src.creationDesignPattern.factoryMethod

fun interface Transport {
    fun deliver(product: Product): Product
}
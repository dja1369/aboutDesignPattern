package src.creationDesignPattern.factoryMethod

class TruckLogistic: Logistics() {
    override fun createTransport(): Transport {
        return Truck()
    }
}
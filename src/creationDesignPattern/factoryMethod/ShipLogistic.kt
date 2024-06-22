package src.creationDesignPattern.factoryMethod

class ShipLogistic: Logistics() {
    override fun createTransport(): Transport {
        return Ship()
    }
}
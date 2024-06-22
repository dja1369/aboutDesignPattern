package src.creationDesignPattern.abstractFactory

class ShipLogistic: Logistics {
    override fun createTransport(): Transport {
        return Ship()
    }
}
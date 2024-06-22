package src.creationDesignPattern.abstractFactory

class TruckLogistic: Logistics {
    override fun createTransport(): Transport {
        return Truck()
    }
}
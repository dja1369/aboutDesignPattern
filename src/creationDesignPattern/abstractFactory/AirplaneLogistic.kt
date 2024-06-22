package src.creationDesignPattern.abstractFactory

class AirplaneLogistic: Logistics {
    override fun createTransport(): Transport {
        return AirPlane()
    }
}
package src.creationDesignPattern.factoryMethod

class AirplaneLogistic: Logistics() {
    override fun createTransport(): Transport {
        return AirPlane()
    }
}
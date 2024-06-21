package src.creationDesignPattern.builder

class Car(
    private val engine: Engine,
    private val wheels: Wheels,
    private val navigator: Navigator
) {
    fun start() = engine.start()
    fun stop() = engine.stop()
    fun increaseSpeed() = engine.increaseSpeed()
    fun decreaseSpeed() = engine.decreaseSpeed()
    fun getSpeed() = engine.getSpeed()

    fun setDestination(destination: String) = navigator.setDestination(destination)
    fun getDestination() = navigator.getDestination()

    fun rotateWheels() = wheels.rotate()
    fun getWheelRotation() = wheels.getRotation()
}
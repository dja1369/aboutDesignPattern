package src.creationDesignPattern.builder

interface Engine {
    fun start()
    fun stop()
    fun increaseSpeed()
    fun decreaseSpeed()
    fun getSpeed(): Int
}
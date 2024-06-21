package src.creationDesignPattern.builder

class AutoEngine: Engine {
    private var speed: Int = 0
    private var gear: Int = 1
    override fun start() {
        println("Auto Engine Started")
    }

    override fun stop() {
        println("Auto Engine Stopped")
    }

    override fun increaseSpeed() {
        speed += 10
        println("Auto Gear Changed")
        when (speed){
            in 0..20 -> gear = 1
            in 21..40 -> gear = 2
            in 41..60 -> gear = 3
            in 61..80 -> gear = 4
            in 81..100 -> gear = 5
        }
    }

    override fun decreaseSpeed() {
        speed -= 10
        println("Auto Gear Changed")
        when (speed){
            in 0..20 -> gear = 1
            in 21..40 -> gear = 2
            in 41..60 -> gear = 3
            in 61..80 -> gear = 4
            in 81..100 -> gear = 5
        }
    }

    override fun getSpeed(): Int = speed
}
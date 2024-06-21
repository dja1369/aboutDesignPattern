package src.creationDesignPattern.builder

class ManualEngine: Engine {
    private var speed: Int = 0
    private var gear: Int = 1
    override fun start() {
        println("Manual Engine started")
    }

    override fun stop() {
        println("Manual Engine stopped")
    }

    override fun increaseSpeed() {
        speed += 10
        changeGear(speed)
    }

    override fun decreaseSpeed() {
        speed -= 10
        changeGear(speed)
    }

    override fun getSpeed(): Int = speed

    private fun changeGear(speed: Int){
        val beforeGear = gear
        when (speed){
            in 0..20 -> gear = 1
            in 21..40 -> gear = 2
            in 41..60 -> gear = 3
            in 61..80 -> gear = 4
            in 81..100 -> gear = 5
        }
        println("Gear changed from $beforeGear to $gear")
    }
}
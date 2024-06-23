package src.structureDesignPattern.adapter

fun main() {
    val adapter = Adapter()
    val voltage110 = `110vAdapter`()
    val voltage220 = `220vAdapter`()
    println("Voltage 110v to 220v: ${adapter.convertVoltage(voltage110)}")
    println("Voltage 220v to 110v: ${adapter.convertVoltage(voltage220)}")
}
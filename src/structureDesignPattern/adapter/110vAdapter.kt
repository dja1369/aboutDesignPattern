package src.structureDesignPattern.adapter

data class `110vAdapter`(
    private val voltage: Int = 110
): Voltage{
    override val outPutVoltage: Int
        get() = voltage
}
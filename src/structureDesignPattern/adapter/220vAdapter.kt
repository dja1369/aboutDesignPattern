package src.structureDesignPattern.adapter

data class `220vAdapter`(
    private val voltage: Int = 220
): Voltage{
    override val outPutVoltage: Int
        get() = voltage
}
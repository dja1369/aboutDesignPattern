package src.structureDesignPattern.adapter

class Adapter {
    fun convertVoltage(voltage: Voltage): Int {
        return when (voltage.outPutVoltage) {
            110 -> 220
            220 -> 110
            else -> throw IllegalArgumentException("Invalid voltage")
        }
    }
}
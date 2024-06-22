package src.structureDesignPattern.decorator

interface DataSource {
    fun writeData(data: String): String
    fun readData(): String
}
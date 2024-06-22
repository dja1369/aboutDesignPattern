package src.structureDesignPattern.decorator

abstract class DataSourceDecorator(
    private val dataSource: DataSource
): DataSource {
    override fun writeData(data: String): String {
        return dataSource.writeData(data)
    }
    override fun readData(): String {
        return dataSource.readData()
    }
}
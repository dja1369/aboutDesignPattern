package src.structureDesignPattern.decorator

class WelcomeDataSource(
    dataSource: DataSource
): DataSourceDecorator(dataSource) {
    override fun writeData(data: String): String {
        println("Decorating data with welcome message")
        return super.writeData(data)
    }
    override fun readData(): String {
        println("Reading data with welcome message")
        return super.readData()
    }
}
package src.structureDesignPattern.decorator

class FileDataSource: DataSource{
    private lateinit var context: String
    override fun writeData(data: String): String {
        context = data
        return "Data written to file: $context"
    }

    override fun readData(): String = context

}
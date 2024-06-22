package src.structureDesignPattern.decorator

fun main() {
    val fileDataSource = FileDataSource()
    val word = "Hello, World!"
    println(fileDataSource.writeData(word))
    println(fileDataSource.readData())
    println("====================================")

    val encodeDataSource = EncodeDataSource(fileDataSource)
    println(encodeDataSource.writeData(word))
    println(encodeDataSource.readData())
    println("====================================")

    val welcomeDataSource = WelcomeDataSource(encodeDataSource)
    println(welcomeDataSource.writeData(word.plus(" Welcome!" )))
    println(welcomeDataSource.readData())
}
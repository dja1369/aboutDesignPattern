package src.structureDesignPattern.facade

fun main() {
    val converter = Converter()
    val intData = IntegerType(10)
    println(converter.convert(intData))
    val stringData = StringType("Hello")
    println(converter.convert(stringData))
    println(converter.convert(FloatType(10.0f)))

}
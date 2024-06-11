package src.structureDesignPattern.composite

fun main() {
    val box = Box()
    val product = Product()
    val product2 = Product()
    box.add(product)
    box.add(product2)
    box.add(Product())
    box.add(Product())
    box.add(Product())
    box.add(Product())

    println(box.getPrice())
    println(box.getName())
    println(box.toString())
}
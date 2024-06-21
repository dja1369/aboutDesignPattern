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
    val box2 = Box()
    box2.add(Product())
    box.add(box2)
    println(box.getPrice())
    println(box.getName())
    println(box.toString())

    println(product.getPrice())
    println(product.getName())
    println(product.toString())

}
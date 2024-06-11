package src.structureDesignPattern.composite

class Product: Component {
    override fun getPrice(): Int {
        return 200
    }

    override fun getName(): String {
        return "Product"
    }
}
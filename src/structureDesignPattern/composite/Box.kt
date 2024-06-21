package src.structureDesignPattern.composite

class Box: Component{
    private val children = mutableListOf<Component>()
    override fun getPrice(): Int {
        return children.sumOf { it.getPrice() }
    }

    override fun getName(): String {
        return "Box"
    }
    override fun toString(): String {
        return "${getName()}, (${children.joinToString { "($it)"}})"
    }

    fun add (component: Component){
        children.add(component)
    }
}
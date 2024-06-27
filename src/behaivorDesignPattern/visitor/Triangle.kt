package src.behaivorDesignPattern.visitor

class Triangle: Shapes{
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun show() {
        println("Triangle")
    }
}

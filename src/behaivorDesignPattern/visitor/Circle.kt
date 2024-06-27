package src.behaivorDesignPattern.visitor

class Circle: Shapes {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun show() {
        return println("Circle")
    }

}

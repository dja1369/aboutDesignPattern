package src.behaivorDesignPattern.visitor

class Square: Shapes{
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun show(){
        println("Square")
    }
}

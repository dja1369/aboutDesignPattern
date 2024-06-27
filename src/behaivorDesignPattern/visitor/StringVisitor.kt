package src.behaivorDesignPattern.visitor

class StringVisitor : Visitor {
    override fun visit(circle: Circle) {
        circle.show()
    }

    override fun visit(square: Square) {
        square.show()
    }

    override fun visit(triangle: Triangle) {
        triangle.show()
    }
}
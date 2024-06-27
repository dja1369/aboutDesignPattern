package src.behaivorDesignPattern.visitor

interface Visitor {
    fun visit(circle: Circle)
    fun visit(square: Square)
    fun visit(triangle: Triangle)
}

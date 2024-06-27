package src.behaivorDesignPattern.visitor

interface Shapes {
    fun accept(visitor: Visitor)
    fun show()
}
package src.behaivorDesignPattern.visitor

fun main() {
    val shapes = listOf(Circle(), Square(), Triangle())
    val visitor = StringVisitor()
    shapes.forEach {
        it.accept(visitor)
    }

    visitor.visit(Circle())

}
package src.behaivorDesignPattern.memento

fun main() {
    val history = History()
    val textEditor = TextEditor(history = history)
    val commander = Commander(textEditor = textEditor)

    commander.write("Hello")
    commander.write("World")
    println(commander.read())

    commander.undo()
    println(commander.read())

    commander.undo()
    println(commander.read())

}
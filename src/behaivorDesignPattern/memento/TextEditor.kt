package src.behaivorDesignPattern.memento

class TextEditor(
    private val history: History
) {
    private val content = mutableListOf<String>()

    fun addContent(text: String) {
        content.add(text)
        history.save(TextEditorState(content.toList()))
    }

    fun undo(){
        val lastState = history.undo()
        content.clear()
        content.addAll(lastState?.content ?: emptyList())
    }

    override fun toString(): String {
        return content.joinToString(", ")
    }
}
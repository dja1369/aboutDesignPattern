package src.behaivorDesignPattern.memento

class Commander(private val textEditor: TextEditor) {
    fun write(content: String){
        textEditor.addContent(content)
    }
    fun read(): String {
        return textEditor.toString()
    }
    fun undo(){
        textEditor.undo()
    }
}
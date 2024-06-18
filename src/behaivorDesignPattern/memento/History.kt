package src.behaivorDesignPattern.memento

class History {
    private val states = mutableListOf<TextEditorState>()
    fun save(state: TextEditorState){
        states.add(state)
    }
    fun undo(): TextEditorState {
        states.apply {
            removeLast()
            return if(isEmpty()){
                TextEditorState(listOf("Empty Word"))
            } else {
                states.last()
            }
        }
    }
}
package src.behaivorDesignPattern.state

class Player(
    private var state: State
) {
    fun setState(state: State) {
        this.state = state
    }

    fun getState(): State {
        return state
    }

    fun doAction(): String {
        return state.doAction()
    }
}
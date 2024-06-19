package src.behaivorDesignPattern.state

class DeactivateState: State{
    override fun doAction(): String {
        return "Player is in deactivate state Can't Any Action"
    }
}
package src.behaivorDesignPattern.state

class ActivateState: State{
    override fun doAction(): String {
        return "Player is in activate state Can Any Action"
    }
}
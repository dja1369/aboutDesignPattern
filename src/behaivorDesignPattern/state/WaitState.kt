package src.behaivorDesignPattern.state

class WaitState: State{
    override fun doAction(): String {
        return "Player is in wait state hole on Plz..."
    }
}
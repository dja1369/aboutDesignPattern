package src.behaivorDesignPattern.state

fun main() {
    val player = Player(WaitState())
    println(player.doAction())
    player.setState(ActivateState())
    println(player.doAction())
    player.setState(DeactivateState())
    println(player.doAction())

}
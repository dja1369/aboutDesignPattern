package src.behaivorDesignPattern.mediator

class ChatUserImpl(
    private val mediator: Mediator,
    private var name: String
): ChatUser{
    val getUser: String
        get() = name
    init{
        mediator.addUser(this)
    }

    override fun send(message: String) {
        mediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("$name received: $message")
    }

    override fun changeName(name: String) {
        this.name = name
        mediator.sendMessage("$name has changed name to $name", this)
    }


}
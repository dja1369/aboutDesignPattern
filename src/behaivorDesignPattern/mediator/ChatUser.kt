package src.behaivorDesignPattern.mediator

interface ChatUser {
    fun send(message: String)
    fun receive(message: String)
    fun changeName(name: String)
}
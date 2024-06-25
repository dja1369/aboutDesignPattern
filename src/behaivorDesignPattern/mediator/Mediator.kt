package src.behaivorDesignPattern.mediator

interface Mediator {
    fun sendMessage(message: String, user: ChatUser)
    fun addUser(user: ChatUser)
}
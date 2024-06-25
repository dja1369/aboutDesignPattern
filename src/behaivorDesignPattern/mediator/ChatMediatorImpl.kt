package src.behaivorDesignPattern.mediator

class ChatMediatorImpl: Mediator {
    private val users = mutableListOf<ChatUser>()
    override fun sendMessage(message: String, user: ChatUser) {
        users.map{
            if(it != user) it.receive(message)
        }
    }

    override fun addUser(user: ChatUser) {
        users.add(user)
    }

}
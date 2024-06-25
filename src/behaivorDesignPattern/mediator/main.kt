package src.behaivorDesignPattern.mediator

fun main() {
    val mediator = ChatMediatorImpl()
    val user1 = ChatUserImpl(mediator, "User Lee")
    val user2 = ChatUserImpl(mediator, "User Kim")
    val user3 = ChatUserImpl(mediator, "User Sin")

    user1.send("Hello")
    println("==================")
    user2.send("Hi")
    println("==================")
    user3.send("Hey")
    println("==================")
    user1.changeName("Lee User")
    println("==================")
    user2.changeName("Kim User")
    println("==================")
    user3.changeName("Sin User")

}
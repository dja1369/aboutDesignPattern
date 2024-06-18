package src.creationDesignPattern.prototype

fun main() {
    val user1 = User("John", 30)
    val user2 = user1.clone()
    println(user1)
    println(user2)
}
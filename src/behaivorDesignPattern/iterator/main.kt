package src.behaivorDesignPattern.iterator

fun main() {
    val friendCollection = FriendCollection()
    friendCollection.addFriend(Friend("John"))
    friendCollection.addFriend(Friend("Jill"))
    friendCollection.addFriend(Friend("Jack"))

    val friendIterator = friendCollection.iterator

    while(friendIterator.hasNext()) {
        val friend = friendIterator.next()
        println(friend)
    }
}
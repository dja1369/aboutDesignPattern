package src.behaivorDesignPattern.iterator

class FriendCollection(
    private val friends: MutableList<Friend> = mutableListOf()
) {
    val iterator: FriendIterator
        get() = FriendIterator(this)
    val size: Int
        get() = friends.size

    fun addFriend(friend: Friend) {
        friends.add(friend)
    }

    fun getFriend(index: Int): Friend {
        return friends[index]
    }

}
package src.behaivorDesignPattern.iterator

class FriendIterator(
    private val friendCollection: FriendCollection
) {
    private var index = 0

    fun hasNext(): Boolean {
        return index < friendCollection.size
    }

    fun next(): Friend {
        return friendCollection.getFriend(index++)
    }
}
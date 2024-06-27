package src.behaivorDesignPattern.observer

class ContentApp(
    private val eventManager: EventManager
) {
    fun createComment() {
        eventManager.notify(EventType.COMMENT, "New comment")
    }

    fun createLike() {
        eventManager.notify(EventType.LIKE, "New like")
    }
}
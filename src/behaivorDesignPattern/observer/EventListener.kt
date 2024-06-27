package src.behaivorDesignPattern.observer

fun interface EventListener {
    fun update(eventType: EventType, data: String)
}

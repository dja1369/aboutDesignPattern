package src.behaivorDesignPattern.observer

enum class EventType {
    COMMENT,
    LIKE
}

class EventManager {
    private val listeners = mutableMapOf<EventType, MutableList<EventListener>>()
    val listenersMap: Map<EventType, MutableList<EventListener>> get() = listeners

    init {
        listeners.putAll(
            EventType.entries.map { it to mutableListOf<EventListener>() }
        )
    }
    fun subscribe(eventType: EventType, listener: EventListener) {
        listeners[eventType]?.add(listener) ?: throw IllegalArgumentException("Invalid event type")
    }
    fun unsubscribe(eventType: EventType, listener: EventListener) {
        listeners[eventType]?.remove(listener) ?: throw IllegalArgumentException("Invalid event type")
    }
    fun notify(eventType: EventType, data: String) {
        listeners[eventType]?.forEach {
            it.update(eventType, data)
        }
    }
}


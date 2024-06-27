package src.behaivorDesignPattern.observer

class LogNotificationListener: EventListener {
    override fun update(eventType: EventType, data: String) {
        println("Log to notify: $data")
    }
}